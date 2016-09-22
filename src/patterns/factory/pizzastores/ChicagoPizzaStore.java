package patterns.factory.pizzastores;

import patterns.factory.Pizza;
import patterns.factory.PizzaIngredientFactory;
import patterns.factory.PizzaStore;
import patterns.factory.ingredientfactories.ChicagoPizzaIngredientFactory;
import patterns.factory.pizza.CheesePizza;
import patterns.factory.pizza.ClamPizza;
import patterns.factory.pizza.PepperoniPizza;
import patterns.factory.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style PepperoniPizza");
        }

        return pizza;
    }
}
