package shildt.aboutBytes;

/**
 * Created by Tony on 31.05.2016.
 */
public class byteShiftRight {
    public static void main(String[] args) {
        int a = 1;
        display(a);
        a >>= 1;
        display(a);

    }

    public static void display(int value) {
        System.out.println("Binary: " + Integer.toBinaryString(value & 0xff) + " Decimal: " + value);
    }
}
