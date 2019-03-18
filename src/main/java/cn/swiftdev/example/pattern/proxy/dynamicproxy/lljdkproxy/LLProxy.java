package cn.swiftdev.example.pattern.proxy.dynamicproxy.lljdkproxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LLProxy {
    public static final String ln = "\r\n";
    public static Object newProxyInstation(LLClassLoader classLoader, Class<?>[] interfaces, LLInvocationHandler llInvocationHandler){

        try{
            //动态生成源代码文件
            String src = generateSrc(interfaces);
            String filePath = LLProxy.class.getResource("").getPath();
            //将java文件写入盘中
            File file = new File(filePath + "Proxy0.java");
            FileWriter fw =new FileWriter(file);
            fw.write(src);
            fw.flush();
            fw.close();
            //3把生成的.java文件编译成.class文件
             JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

            StandardJavaFileManager manage = compiler.getStandardFileManager(null,null,null);
            Iterable iterable = manage.getJavaFileObjects(file);

            JavaCompiler.CompilationTask task = compiler.getTask(null,manage,null,null,null,iterable);
            task.call();
            manage.close();

            //4.生成class文件加载到JVM中
            Class proxyClass = classLoader.findClass("Proxy0");
            Constructor c = proxyClass.getConstructor(LLInvocationHandler.class);
            file.delete();

            return c.newInstance(llInvocationHandler);

        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }


    private static String generateSrc(Class<?>[] interfaces){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("package cn.swiftdev.example.pattern.proxy.dynamicproxy.lljdkproxy;").append(ln);
        stringBuffer.append("import  cn.swiftdev.example.pattern.proxy.Person;").append(ln);
        stringBuffer.append("import java.lang.reflect.*;").append(ln);

        stringBuffer.append("public class Proxy0 implements " + interfaces[0].getName() + "{").append(ln);

        stringBuffer.append("private LLInvocationHandler h; ").append(ln);

        stringBuffer.append("public Proxy0(LLInvocationHandler h){").append(ln);
        stringBuffer.append("this.h=h;").append(ln);
        stringBuffer.append("}").append(ln);

        for (Method m :interfaces[0].getMethods()){
            Class<?>[] params = m.getParameterTypes();
            StringBuffer paramNames = new StringBuffer();
            StringBuffer paramValues = new StringBuffer();
            StringBuffer paramClasses = new StringBuffer();

            for (int i = 0; i <params.length; i ++){
                Class clazz = params[i];
                String type = clazz.getName();
                String paramName = clazz.getSimpleName().toLowerCase();
                System.out.println(type);
                System.out.println(paramName);
                paramNames.append(type + " " + paramName);
                paramValues.append(paramName);
                paramClasses.append(clazz.getName() + ".class");

                if (i > 0 && i <params.length - 1){
                    paramNames.append(",");
                    paramValues.append(",");
                    paramClasses.append(",");
                }

            }

            stringBuffer.append("public " + m.getReturnType().getName() + " " + m.getName() + "(" + paramNames.toString() + ") {" + ln);
            stringBuffer.append("try{" + ln);
            stringBuffer.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{" + paramClasses.toString() + "});" + ln);
            stringBuffer.append((hasReturnValue(m.getReturnType()) ? "return " : "") + getCaseCode("this.h.invoke(this,m,new Object[]{" + paramValues + "})",m.getReturnType()) + ";" + ln);
            stringBuffer.append("}catch(Error _ex) { }");
            stringBuffer.append("catch(Throwable e){" + ln);
            stringBuffer.append("throw new UndeclaredThrowableException(e);" + ln);
            stringBuffer.append("}");
            stringBuffer.append(getReturnEmptyCode(m.getReturnType()));
            stringBuffer.append("}");



        }



        stringBuffer.append("}");

        System.out.println(stringBuffer.toString());

        return stringBuffer.toString();
    }

    private static Map<Class,Class> mappings = new HashMap<Class, Class>();
    static {
        mappings.put(int.class,Integer.class);
    }

    private static String getReturnEmptyCode(Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "return 0;";
        }else if(returnClass == void.class){
            return "";
        }else {
            return "return null;";
        }
    }

    private static String getCaseCode(String code,Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "((" + mappings.get(returnClass).getName() +  ")" + code + ")." + returnClass.getSimpleName() + "Value()";
        }
        return code;
    }

    private static boolean hasReturnValue(Class<?> clazz){
        return clazz != void.class;
    }

    private static String toLowerFirstCase(String src){
        char [] chars = src.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }

    public static void main(String[] args) {

        LLProxy.generateSrc(HumanImpl.class.getInterfaces());
    }
}
