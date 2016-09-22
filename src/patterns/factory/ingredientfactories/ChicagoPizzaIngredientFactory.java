package patterns.factory.ingredientfactories;

import patterns.factory.PizzaIngredientFactory;
import patterns.factory.ingredients.*;
import patterns.factory.ingredients.cheese.Mozzarella;
import patterns.factory.ingredients.clams.FrozenClams;
import patterns.factory.ingredients.dough.ThickCrustDough;
import patterns.factory.ingredients.pepperoni.SlicedPepperoni;
import patterns.factory.ingredients.sauce.PlumTomatoSauce;
import patterns.factory.ingredients.veggies.BlackOlive;
import patterns.factory.ingredients.veggies.EggPlant;
import patterns.factory.ingredients.veggies.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough( ) {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce( ) {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese( ) {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies( ) {
        Veggies veggies[] = { new EggPlant(), new Spinach(), new BlackOlive() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni( ) {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams( ) {
        return new FrozenClams();
    }
}
