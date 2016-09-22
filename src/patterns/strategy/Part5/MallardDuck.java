package patterns.strategy.Part5;

import patterns.strategy.Part5.Fly.FlyWithWigns;
import patterns.strategy.Part5.Quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWigns();
    }

    @Override
    void display() {
        System.out.println("I'm a mallard duck.");
    }
}
