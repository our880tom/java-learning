package cn.swiftdev.example.pattern.decorator.BatterCake;

public class EggDecorator extends BatterCakeDecorator{
    private BatterCake batterCake;

    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
        this.batterCake = batterCake;
    }

    @Override
    public String msg() {
        return batterCake.msg() + " +1个鸡蛋";
    }

    @Override
    public int price() {
        return batterCake.price() + 1;
    }
}
