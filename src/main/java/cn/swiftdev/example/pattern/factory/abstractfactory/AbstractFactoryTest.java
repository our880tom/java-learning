package cn.swiftdev.example.pattern.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args){
        ICarFactory carFactory = new BMWCarFactory();
        IBike bike = carFactory.createBike();
        IBus bus = carFactory.createBus();

        bike.ride();
        bus.drive();

    }
}
