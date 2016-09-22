package patterns.adapter.Duck;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        testDuck(turkeyAdapter);
        System.out.println("\nThe TurkeyAdapter says...");
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
