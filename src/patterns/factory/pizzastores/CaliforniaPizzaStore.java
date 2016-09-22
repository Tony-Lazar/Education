package patterns.factory.pizzastores;

import patterns.factory.Pizza;
import patterns.factory.PizzaStore;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;

        /*
        if (item.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new CaliforniaStyleVeggeiPizza();
        } else if (item.equals("clam")) {
            return new CaliforniaStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new CaliforniaStylePepperoniPizza();
        } else return null;*/

        return pizza;
    }
}
