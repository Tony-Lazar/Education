package patterns.strategy.Part3;

public class DecoyDuck extends Duck {
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
        System.out.println("I'm decoy duck.");
    }
}
