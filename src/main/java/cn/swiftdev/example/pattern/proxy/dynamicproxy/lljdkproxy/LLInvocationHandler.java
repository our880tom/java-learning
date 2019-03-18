package cn.swiftdev.example.pattern.proxy.dynamicproxy.lljdkproxy;

import java.lang.reflect.Method;

public interface LLInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
