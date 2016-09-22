package patterns.decorator.Decorator2.Coffee;

import patterns.decorator.Decorator2.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost( ) {
        return .89;
    }
}
