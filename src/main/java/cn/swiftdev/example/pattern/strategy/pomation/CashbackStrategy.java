package cn.swiftdev.example.pattern.strategy.pomation;

public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPomation() {
        System.out.println("现金返现，会返回到您的支付宝账号中");
    }
}
