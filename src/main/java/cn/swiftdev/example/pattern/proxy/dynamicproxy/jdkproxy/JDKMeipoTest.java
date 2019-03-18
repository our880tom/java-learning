package cn.swiftdev.example.pattern.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JDKMeipoTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Object obj = new JDKMeipo().getInstance(new Girl());
        Method method = obj.getClass().getMethod("findLove",null);
        method.invoke(obj);
    }
}
