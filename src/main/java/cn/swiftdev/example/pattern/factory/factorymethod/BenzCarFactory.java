package cn.swiftdev.example.pattern.factory.factorymethod;

import cn.swiftdev.example.pattern.factory.BMWCar;
import cn.swiftdev.example.pattern.factory.BenzCar;
import cn.swiftdev.example.pattern.factory.ICar;

public class BenzCarFactory implements ICarFactory {
    public ICar create() {
        return new BenzCar();
    }
}
