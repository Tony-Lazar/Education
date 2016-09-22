package forExample.p2;

import forExample.p1.A;

/**
 * Created by Tony on 01.06.2016.
 */
public class B extends A{
/*    public void process(A a) {
        a.i = a.i*2;
    }*/

    public static void main(String[] args) {
        A a = new B();
        B b = new B();
//        b.process(a);
        System.out.println(a.getI());
    }
}
