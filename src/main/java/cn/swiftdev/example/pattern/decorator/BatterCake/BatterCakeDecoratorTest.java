package cn.swiftdev.example.pattern.decorator.BatterCake;

public class BatterCakeDecoratorTest {
    public static void main(String[] args) {
        BatterCake batterCake = new BaseBatterCake();
        //加两个鸡蛋
        batterCake = new EggDecorator(batterCake);
        batterCake = new EggDecorator(batterCake);
        batterCake = new SausageDecorator(batterCake);

        System.out.println(batterCake.msg());
        System.out.println(batterCake.price());
    }
}
