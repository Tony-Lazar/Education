package patterns.strategy.Part5.Quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
