package cn.swiftdev.example.pattern.singleton.threadlocal;

public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){

    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue(){
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }




}
