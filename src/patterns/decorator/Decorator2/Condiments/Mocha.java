package patterns.decorator.Decorator2.Condiments;

import patterns.decorator.Decorator2.Beverage;
import patterns.decorator.Decorator2.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription( ) {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost( ) {
        return .20 + beverage.cost();
    }
}
