package cn.swiftdev.example.pattern.strategy.pomation;

public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPomation() {
        System.out.println("无促销活动");
    }
}
