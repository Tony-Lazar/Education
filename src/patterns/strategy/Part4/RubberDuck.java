package patterns.strategy.Part4;

public class RubberDuck extends Duck implements Quackable{
    @Override
    public void quack() {
        System.out.printf("I'm quacking.");
    }

    @Override
    void display() {
        System.out.println("I'm rubber duck.");
    }
}
