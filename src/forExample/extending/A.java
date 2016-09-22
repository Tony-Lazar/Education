package forExample.extending;

public class A {
    private int a;
    protected float b;
    public String c;

    private void getInt( ) {
        System.out.println("int from A: " + a);
    }

    protected void getFloat( ) {
        System.out.println("float from A: " + b);
    }

    public void getString( ) {
        System.out.println("string from A: " + c);
    }

    public A(int a, float b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}