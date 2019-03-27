package cn.swiftdev.example.pattern.decorator.BatterCake;

public class BatterCakeDecorator extends BatterCake{
    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override

    public String msg() {
        return batterCake.msg();
    }

    @Override
    public int price() {
        return batterCake.price();
    }
}
