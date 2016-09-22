package patterns.strategy.Part1;

public class Test {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.quack();
        mallard.swim();

        System.out.println();

        Duck redhead = new RedHeadDuck();
        redhead.display();
        redhead.quack();
        redhead.swim();
    }
}
