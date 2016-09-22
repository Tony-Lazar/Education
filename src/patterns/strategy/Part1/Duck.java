package patterns.strategy.Part1;

public abstract class Duck {
    void quack() {
        System.out.println("I'm quacking.");
    }

    void swim() {
        System.out.println("I'm swimming.");
    }

    abstract void display();
}
