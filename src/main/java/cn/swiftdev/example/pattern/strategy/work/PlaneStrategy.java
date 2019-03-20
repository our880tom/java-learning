package cn.swiftdev.example.pattern.strategy.work;

public class PlaneStrategy implements TravelStrategy{
    @Override
    public void travel() {
        System.out.println("我坐飞机去北京");
    }
}
