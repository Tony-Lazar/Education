package forExample.extending;

public class C extends B {

    float b = 50;

    public C(int a, float b, String c) {
        super(a, b, c);
    }

    @Override
    public void getString() {
        System.out.println("string from C: " + c);
    }


}