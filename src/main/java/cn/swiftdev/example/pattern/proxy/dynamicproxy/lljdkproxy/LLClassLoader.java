package cn.swiftdev.example.pattern.proxy.dynamicproxy.lljdkproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class LLClassLoader extends ClassLoader{

    private File classPathFile;

    public LLClassLoader(){
        String classPath = LLClassLoader.class.getResource("").getPath();
        System.out.println(classPath);
        classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = LLClassLoader.class.getPackage().getName() + "." + name;
        System.out.println(className);
        if (classPathFile != null){
            File classFile = new File( classPathFile,name.replaceAll("\\.", File.separator) + ".class");
            System.out.println(classFile.getPath());
            if (classFile.exists()){
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try{
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] buff= new byte[1024];
                    int len;
                    while((len =in.read(buff)) != -1){
                        out.write(buff,0,len);
                    }
                    return this.defineClass(className, out.toByteArray(),0, out.size());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

        }
        return null;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        LLClassLoader classLoader = new LLClassLoader();
        classLoader.findClass("Test");

        System.out.println(Test.class.getClassLoader());


    }
}
