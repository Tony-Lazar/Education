package patterns.strategy.Part2;

public abstract class Duck {
    void quack() {
        System.out.println("I'm quacking.");
    }

    void swim() {
        System.out.println("I'm swimming.");
    }

    void fly() {
        System.out.println("I'm flying.");
    }

    abstract void display();
}
