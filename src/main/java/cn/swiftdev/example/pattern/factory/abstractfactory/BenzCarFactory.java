package cn.swiftdev.example.pattern.factory.abstractfactory;

public class BenzCarFactory implements ICarFactory {
    public IBike createBike() {
        return new BenzBike();
    }

    public IBus createBus() {
        return new BenzBus();
    }
}
