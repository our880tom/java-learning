package cn.swiftdev.example.pattern.strategy.pomation;

public class PromotionActivity {

    private PromotionStrategy promtionStrategy;

    public PromotionActivity(PromotionStrategy promtionStrategy){
        this.promtionStrategy = promtionStrategy;
    }

    public void execute(){
        promtionStrategy.doPomation();
    }
}
