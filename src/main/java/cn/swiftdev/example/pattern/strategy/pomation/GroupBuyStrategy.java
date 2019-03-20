package cn.swiftdev.example.pattern.strategy.pomation;

public class GroupBuyStrategy implements PromotionStrategy {
    @Override
    public void doPomation() {
        System.out.println("团队购买，便宜");
    }
}
