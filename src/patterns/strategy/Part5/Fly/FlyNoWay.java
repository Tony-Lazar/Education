package patterns.strategy.Part5.Fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}
