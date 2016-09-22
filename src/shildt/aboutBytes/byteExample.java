package shildt.aboutBytes;

/**
 * Created by Tony on 31.05.2016.
 */
public class byteExample {
    public static void main(String[] args) {
        /*byte b1 = 0b0010_1010;
        byte b2 = (byte)~b1;
        displayPerson(b1);
        displayPerson(b2);*/

        /*byte b1 = 0b0010_1010;
        byte b2 = 0b0000_1111;
        displayPerson(b1);
        displayPerson(b2);
        displayPerson((byte)(b1 & b2));*/

        /*byte b1 = 0b0010_1010;
        byte b2 = 0b0000_1111;
        displayPerson(b1);
        displayPerson(b2);
        displayPerson((byte)(b1 | b2));*/

        byte b1 = 0b0010_1010;
        byte b2 = 0b0000_1111;
        display(b1);
        display(b2);
        display((byte)(b1 ^ b2));
    }

    public static void display(byte value) {
        System.out.println("Binary: " + Integer.toBinaryString((value & 0xFF) + 0x100).substring(1) + " Decimal: " + value);
    }
}
