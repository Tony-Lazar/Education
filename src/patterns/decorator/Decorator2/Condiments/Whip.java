package patterns.decorator.Decorator2.Condiments;

import patterns.decorator.Decorator2.Beverage;
import patterns.decorator.Decorator2.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription( ) {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost( ) {
        return .1 + beverage.cost();
    }
}
