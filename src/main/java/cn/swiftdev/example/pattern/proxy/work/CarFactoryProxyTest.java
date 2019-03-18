package cn.swiftdev.example.pattern.proxy.work;

public class CarFactoryProxyTest {
    public static void main(String[] args) {
        CarFactory carFactory=(CarFactory) new Car4SStore().getInstance(CarFactory.class);
        carFactory.sell();
    }
}
