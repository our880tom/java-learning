package cn.swiftdev.example.pattern.decorator.BatterCake;

public class SausageDecorator extends BatterCakeDecorator{
    private BatterCake batterCake;

    public SausageDecorator(BatterCake batterCake) {
        super(batterCake);
        this.batterCake = batterCake;
    }

    @Override
    public String msg() {
        return batterCake.msg() + " +1个烤肠";
    }

    @Override
    public int price() {
        return batterCake.price() + 2;
    }

}
