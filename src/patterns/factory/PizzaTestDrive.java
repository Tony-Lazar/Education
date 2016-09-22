package patterns.factory;

import patterns.factory.pizzastores.ChicagoPizzaStore;
import patterns.factory.pizzastores.NYPizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("cheese");

        System.out.println();

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        chicagoStore.orderPizza("veggie");
    }
}
