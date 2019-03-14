package cn.swiftdev.example.pattern.singleton.lazy;

import cn.swiftdev.example.pattern.singleton.threadlocal.ThreadLocalSingleton;

public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread thread = new Thread(new MyThread());
        Thread thread1 = new Thread(new MyThread());

        thread.start();
        thread1.start();

    }

}
