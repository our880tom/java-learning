package cn.swiftdev.example.pattern.singleton.lazy;

import cn.swiftdev.example.pattern.singleton.threadlocal.ThreadLocalSingleton;

public class MyThread implements Runnable{
    public void run() {
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + ":" + singleton);

    }
}
