package patterns.strategy.Part2;

public class RubberDuck extends Duck {

    @Override
    void quack() {
        System.out.println("I can't quack.");
    }



    @Override
    void display() {
        System.out.println("I'm rubber duck.");
    }
}
