package cn.swiftdev.example.pattern.decorator.BatterCake;

public class BaseBatterCake extends BatterCake{
    @Override
    public String msg() {
        return "基本煎饼";
    }

    @Override
    public int price() {
        return 5;
    }
}
