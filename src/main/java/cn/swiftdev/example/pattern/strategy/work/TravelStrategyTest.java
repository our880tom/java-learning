package cn.swiftdev.example.pattern.strategy.work;

public class TravelStrategyTest {
    public static void main(String[] args) {
        new TravelActivity(new PlaneStrategy()).travel();
    }
}
