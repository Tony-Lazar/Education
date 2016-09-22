package patterns.decorator.Decorator2.Condiments;

import patterns.decorator.Decorator2.Beverage;
import patterns.decorator.Decorator2.CondimentDecorator;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription( ) {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost( ) {
        return .1 + beverage.cost();
    }
}
