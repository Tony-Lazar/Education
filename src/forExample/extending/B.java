package forExample.extending;

public class B extends A {
    protected float b = 666.666f;
    protected double d;
    public byte e;

    @Override
    protected void getFloat() {
        System.out.println("float from B: " + b);
    }

    /*@Override
    public void getString() {
        System.out.println("string from B: " + c);
    }*/

    protected void getDouble() {
        System.out.println("double from B: " + d);
    }

    public void getByte() {
        System.out.println("byte from B: " + e);
    }

    public B(int a, float b, String c) {
        super(a, b, c);
    }

    /*public B(int a, float b, String c, double d, byte e) {
        super(a, b, c);
        this.d = d;
        this.e = e;
    }*/
}
