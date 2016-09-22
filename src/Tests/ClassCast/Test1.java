package Tests.ClassCast;

public class Test1 {
    public static void main(String[] args) {
        Object o = new Object();
        String s = (String) o;
        System.out.println(s);
    }
}