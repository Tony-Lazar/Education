package patterns.singleton;

public class Singleton {
    private static Singleton uniqueSingleton;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (uniqueSingleton == null)
            uniqueSingleton = new Singleton();
        return uniqueSingleton;
    }

    // another methods
}
