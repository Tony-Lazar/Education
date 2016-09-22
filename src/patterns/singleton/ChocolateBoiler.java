package patterns.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new ChocolateBoiler();
        return uniqueInstance;
    }

    public void fill() {
        if (!isEmpty()) {
            empty = false;
            boiled = false;
            // filling
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // pour out milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // boil
            boiled = true;
        }
    }

    public boolean isEmpty( ) {
        return empty;
    }

    public boolean isBoiled( ) {
        return boiled;
    }
}
