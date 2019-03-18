package cn.swiftdev.example.pattern.proxy.simpleproxy;

public class RealSubject implements Subject {
    public void request() {
        System.out.println("real service called.");
    }
}
