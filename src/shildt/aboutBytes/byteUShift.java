package shildt.aboutBytes;

/**
 * Created by Tony on 31.05.2016.
 */
public class byteUShift  {
    public static void main(String[] args) {
        int a = -1;
        display(a);
        a = a >>> 24;
        display(a);
    }


    public static void display(int value) {
        System.out.println("Binary: " + Integer.toBinaryString(value) + " Decimal: " + value);
    }
}
