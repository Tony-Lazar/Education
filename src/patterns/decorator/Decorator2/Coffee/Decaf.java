package patterns.decorator.Decorator2.Coffee;

import patterns.decorator.Decorator2.Beverage;

public class Decaf extends Beverage {    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost( ) {
        return 1.05;
    }
}
