package cn.swiftdev.example.pattern.factory.simplefactory;

import cn.swiftdev.example.pattern.factory.ICar;

public class SimpleFactoryTest {

    public static void main(String[] args){
        CarFactory carFactory = new CarFactory();
        ICar car = carFactory.create("BMW");
        car.drive();
    }
}
