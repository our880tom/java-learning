package cn.swiftdev.example.pattern.strategy.work;

public class TravelActivity {
    TravelStrategy travelStrategy;

    public TravelActivity(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travel(){
        travelStrategy.travel();
    }
}
