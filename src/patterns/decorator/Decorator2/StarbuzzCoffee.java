package patterns.decorator.Decorator2;

import patterns.decorator.Decorator2.Coffee.DarkRoast;
import patterns.decorator.Decorator2.Coffee.Espresso;
import patterns.decorator.Decorator2.Coffee.HouseBlend;
import patterns.decorator.Decorator2.Condiments.Mocha;
import patterns.decorator.Decorator2.Condiments.Soy;
import patterns.decorator.Decorator2.Condiments.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
            + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
            + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
            + " $" + beverage3.cost());
    }
}
