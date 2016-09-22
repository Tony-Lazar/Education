package patterns.strategy.Part4;

public class MallardDuck extends Duck implements Quackable, Flyable{
    @Override
    public void quack() {
        System.out.println("I'm quacking.");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying.");
    }

    @Override
    void display() {
        System.out.println("I'm mallard duck.");
    }
}
