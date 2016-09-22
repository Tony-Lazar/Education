package patterns.strategy.Part2;

public class Test {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.quack();
        mallard.swim();
        mallard.fly();

        System.out.println();

        Duck redhead = new RedHeadDuck();
        redhead.display();
        redhead.quack();
        redhead.swim();
        mallard.fly();

        System.out.println();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.quack();
        rubber.swim();
        rubber.fly();

        /*
            Казалось бы, в этой
            ситуации наследование
            идеально подходит для
            повторного использования
            кода - но с сопровождением
            возникают проблемы
         */
    }
}
