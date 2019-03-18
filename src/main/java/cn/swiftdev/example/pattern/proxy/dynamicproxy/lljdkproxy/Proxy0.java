package cn.swiftdev.example.pattern.proxy.dynamicproxy.lljdkproxy;

import cn.swiftdev.example.pattern.proxy.Person;

import java.lang.reflect.*;

public class Proxy0 implements cn.swiftdev.example.pattern.proxy.dynamicproxy.lljdkproxy.Human {
    private LLInvocationHandler h;

    public Proxy0(LLInvocationHandler h) {
        this.h = h;
    }

    public void live(java.lang.String string) {
        try {
            Method m = cn.swiftdev.example.pattern.proxy.dynamicproxy.lljdkproxy.Human.class.getMethod("live", new Class[]{java.lang.String.class});
            this.h.invoke(this, m, new Object[]{string});
        } catch (Error _ex) {
        } catch (Throwable e) {
            throw new UndeclaredThrowableException(e);
        }
    }
}