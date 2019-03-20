package cn.swiftdev.example.pattern.strategy.pomation;

public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPomation() {
        System.out.println("领取优惠券，课程的价格直接减优惠券面值抵扣");
    }
}
