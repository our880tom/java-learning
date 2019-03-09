package cn.swiftdev.example.pattern.factory.abstractfactory;

public interface ICarFactory {

    IBike createBike();

    IBus createBus();
}
