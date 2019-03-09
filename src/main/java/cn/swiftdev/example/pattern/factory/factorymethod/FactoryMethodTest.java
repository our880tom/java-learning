package cn.swiftdev.example.pattern.factory.factorymethod;

import cn.swiftdev.example.pattern.factory.ICar;

public class FactoryMethodTest {
    public static void main(String[] args){
        ICarFactory carFactory = new BenzCarFactory();
        ICar car = carFactory.create();
        car.drive();
    }
}
