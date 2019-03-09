package cn.swiftdev.example.pattern.factory.factorymethod;

import cn.swiftdev.example.pattern.factory.BMWCar;
import cn.swiftdev.example.pattern.factory.ICar;

public class BMWCarFactory implements ICarFactory {
    public ICar create() {
        return new BMWCar();
    }
}
