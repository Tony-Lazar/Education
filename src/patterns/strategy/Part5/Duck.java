package patterns.strategy.Part5;

import patterns.strategy.Part5.Fly.FlyBehavior;
import patterns.strategy.Part5.Quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }

    void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void swim() {
        System.out.println("I'm swimming.");
    }

    abstract void display();
}
