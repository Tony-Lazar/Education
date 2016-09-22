package shildt.aboutStringBuffer.StringBuffer5;

public class replaceDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is a test.");
        System.out.println("Before replace: " + sb);
        sb.replace(5, 7, "was");
        System.out.println("After replace: " + sb);
    }
}
