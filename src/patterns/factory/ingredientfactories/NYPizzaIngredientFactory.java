package patterns.factory.ingredientfactories;

import patterns.factory.PizzaIngredientFactory;
import patterns.factory.ingredients.*;
import patterns.factory.ingredients.cheese.ReggianoCheese;
import patterns.factory.ingredients.clams.FreshClams;
import patterns.factory.ingredients.dough.ThinCrushDough;
import patterns.factory.ingredients.sauce.MarinaraSauce;
import patterns.factory.ingredients.veggies.Garlic;
import patterns.factory.ingredients.veggies.Mushroom;
import patterns.factory.ingredients.veggies.Onion;
import patterns.factory.ingredients.veggies.RedPepper;
import patterns.factory.ingredients.pepperoni.SlicedPepperoni;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough( ) {
        return new ThinCrushDough();
    }

    @Override
    public Sauce createSauce( ) {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese( ) {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies( ) {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni( ) {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams( ) {
        return new FreshClams();
    }
}
