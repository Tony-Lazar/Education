package shildt.aboutPolimorph;

/**
 * Created by Tony on 01.06.2016.
 */
public class methodsOverload {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        display(a, b);
    }

    public static void display(int ... a) {
        System.out.println("inside int...");
    }

    public static void display(long a, long b) {
        System.out.println("inside long");
    }

    public static void display(Integer a, Integer b) {
        System.out.println("inside Integer");
    }
}
