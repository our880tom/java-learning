package cn.swiftdev.example.pattern.singleton.lazy;

public class LazySimpleSingletonTest {

    public static void main(String[] args){
        Thread thread = new Thread(new MyThread());
        Thread thread1 = new Thread(new MyThread());

        thread.start();
        thread1.start();
    }
}