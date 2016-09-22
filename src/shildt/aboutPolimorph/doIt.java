package shildt.aboutPolimorph;

/**
 * Created by Tony on 01.06.2016.
 */
public class doIt {
    public static void main(String[] args) {
        test("string");
    }

    public static void test(String String) {
        int i = 10;
        i :
        for (int k = 0; k < 10; k++) {
            System.out.println(String + i);
            if (k * k > 10)
                continue i;
        }
    }

    class X {
        <X> X(X x) {
            System.out.println(x);
        }
    }
}
