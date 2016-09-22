package shildt.aboutBytes;

/**
 * Created by Tony on 31.05.2016.
 */
public class byteShiftLeft {
    public static void main(String[] args) {
/*        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);
        displayPerson(a);
        displayPerson(i);
        displayPerson(b);*/

        int i;
        int num = 0xffffffe;

        for (i = 0; i < 4; i++) {
            num <<= 1;
            display(num);
        }
    }

    public static void display(byte value) {
        System.out.println("Binary: " + Integer.toBinaryString((value & 0xFF) + 0x100).substring(1) + " Decimal: " + value);
    }

    public static void display(int value) {
        System.out.println("Binary: " + Integer.toBinaryString(value) + " Decimal: " + value);
    }
}
