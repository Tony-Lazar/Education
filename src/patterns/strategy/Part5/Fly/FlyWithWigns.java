package patterns.strategy.Part5.Fly;

public class FlyWithWigns implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly with wings.");
    }
}
