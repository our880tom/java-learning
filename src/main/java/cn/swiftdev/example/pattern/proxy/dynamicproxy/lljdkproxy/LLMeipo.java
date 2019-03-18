package cn.swiftdev.example.pattern.proxy.dynamicproxy.lljdkproxy;

import java.lang.reflect.Method;

public class LLMeipo implements LLInvocationHandler{
    private Object target;

    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();

        return LLProxy.newProxyInstation(new LLClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object obj = method.invoke(target,args);
        return obj;
    }
}
