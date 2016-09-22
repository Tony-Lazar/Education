package patterns.factory;

import patterns.factory.ingredients.*;

public abstract class Pizza {
    protected Cheese    cheese;
    protected Clams     clam;
    protected Dough     dough;
    protected String    name;
    protected Pepperoni pepperoni;
    protected Sauce     sauce;
    protected Veggies   veggies[];

    public abstract void prepare( );

    public void bake( ) {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut( ) {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box( ) {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName( ) {
        return name;
    }

    @Override
    public String toString( ) {
        return super.toString();
    }
}
