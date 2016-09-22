package shildt.aboutInterface.Implements2;

/**
 * Created by Tony on 02.06.2016.
 */
public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();

        if (nif.isNotNegative(10))
            System.out.println("10 is not negative");
        if (nif.isNotNegative(-12))
            System.out.println("This won't be showed");
    }
}
