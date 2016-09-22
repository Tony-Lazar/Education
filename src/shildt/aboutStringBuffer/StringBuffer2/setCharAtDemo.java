package shildt.aboutStringBuffer.StringBuffer2;

public class setCharAtDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("buffer before: " + sb);
        System.out.println("before charAt[1]: " + sb.charAt(1));

        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("buffer after: " + sb);
        System.out.println("after charAt[1]: " + sb.charAt(1));
    }
}
