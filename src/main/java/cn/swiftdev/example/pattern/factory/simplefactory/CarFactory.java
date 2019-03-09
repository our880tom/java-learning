package cn.swiftdev.example.pattern.factory.simplefactory;


import cn.swiftdev.example.pattern.factory.BMWCar;
import cn.swiftdev.example.pattern.factory.ICar;

public class CarFactory {

    public ICar create(String name){
        if ("BMW".equals(name)){
            return new BMWCar();
        }
        return null;
    }
}
