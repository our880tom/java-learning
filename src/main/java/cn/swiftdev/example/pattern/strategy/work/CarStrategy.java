package cn.swiftdev.example.pattern.strategy.work;

public class CarStrategy implements TravelStrategy{
    @Override
    public void travel() {
        System.out.println("我开车去北京");
    }
}
