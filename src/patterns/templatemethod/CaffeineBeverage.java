package patterns.templatemethod;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
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

    public static class Test {
        public static void main(String[] args) {
            Tea myTea = new Tea();
            myTea.prepareRecipe();
        }
    }
}
