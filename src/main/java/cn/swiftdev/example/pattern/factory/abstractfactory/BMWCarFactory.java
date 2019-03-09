package cn.swiftdev.example.pattern.factory.abstractfactory;

public class BMWCarFactory implements ICarFactory {

    public IBike createBike() {
        return new BMWBIke();
    }

    public IBus createBus() {
        return new BMWBus();
    }
}
