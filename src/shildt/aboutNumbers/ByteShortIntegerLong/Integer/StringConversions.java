package shildt.aboutNumbers.ByteShortIntegerLong.Integer;

public class StringConversions {
    public static void main(String[] args) {
        int num = 19648;
        System.out.println(num + " binary: " + Integer.toBinaryString(num));
        System.out.println(num + " octal: " + Integer.toOctalString(num));
        System.out.println(num + " hex: " + Integer.toHexString(num));
    }
}
