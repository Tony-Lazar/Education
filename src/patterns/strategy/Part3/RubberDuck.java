package patterns.strategy.Part3;

public class RubberDuck extends Duck {
    @Override
    void quack() {
        System.out.println("I can't quack.");
    }

    @Override
    void fly() {
        // пустой метод
    }

    @Override
    void display() {
        System.out.println("I'm rubber duck.");
    }
}
