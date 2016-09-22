package forExample.extending2;

import forExample.extending.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("objects are inited!");

        A aa = new A(10, 20, "30");
        A ab = new A(10, 20, "30");
        A ac = new A(10, 20, "30");

        System.out.println();

//        aa.getFloat();
        aa.getString();

        System.out.println();

//        ab.getFloat();
        ab.getString();
        System.out.println(ab.c);

        System.out.println();

//        ac.getFloat();
        ac.getString();

        System.out.println();

        System.out.println("objects are inited!");

        B bb = new B(10, 20, "30");
        B bc = new C(10, 20, "30");

        System.out.println();

//        bb.getFloat();
        bb.getString();
//        bb.getDouble();
        bb.getByte();

        System.out.println();

//        bc.getFloat();
        bc.getString();
//        bc.getDouble();
        bc.getByte();

        System.out.println("object is inited!");

        C cc = new C(10, 20, "30");

        System.out.println();

//        cc.getFloat();
        cc.getString();
//        cc.getDouble();
        cc.getByte();
    }
}
