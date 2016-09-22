package patterns.strategy.Part5;

import patterns.strategy.Part5.Quack.MuteQuack;
import patterns.strategy.Part5.Quack.Squeak;

public class Test {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.setQuackBehavior(new Squeak());
        mallard.performQuack();
        mallard.setQuackBehavior(new MuteQuack());
        mallard.performQuack();
    }
}
