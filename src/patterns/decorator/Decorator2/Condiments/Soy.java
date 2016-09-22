package patterns.decorator.Decorator2.Condiments;

import patterns.decorator.Decorator2.Beverage;
import patterns.decorator.Decorator2.CondimentDecorator;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription( ) {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost( ) {
        return .15 + beverage.cost();
    }
}
