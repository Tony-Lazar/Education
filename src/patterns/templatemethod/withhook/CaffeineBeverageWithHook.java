package patterns.templatemethod.withhook;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments())
            addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }

    public static class BeverageTestDrive {
        public static void main(String[] args) {
            CaffeineBeverageWithHook teaHook = new TeaWithHook();
            CaffeineBeverageWithHook coffeeHook = new CoffeeWithHook();

            System.out.println("\nMaking tea...");
            teaHook.prepareRecipe();

            System.out.println("\nMaking coffee...");
            coffeeHook.prepareRecipe();
        }
    }
}
