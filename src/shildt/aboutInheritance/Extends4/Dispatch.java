package shildt.aboutInheritance.Extends4;

/**
 * Created by Tony on 02.06.2016.
 */
public class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A r;
        r = a;
        r.callMe();
        r = b;
        r.callMe();
        r = c;
        r.callMe();
    }
}
