package forExample.extending;

public class Test {
    public static void main(String[] args) {
        System.out.println("objects are initialized!");

        A aa = new A(10, 20, "30");
        A ab = new B(10, 20, "30");
        A ac = new C(10, 20, "30");

        System.out.println();

        System.out.println("aa  <---------<<<\n");
        aa.getFloat();
        aa.getString();

        System.out.println();

        System.out.println("ab  <---------<<<\n");
        ab.getFloat();
        ab.getString(); //not overridden for B

        System.out.println();

        System.out.println("ac  <---------<<<\n");
        ac.getFloat(); //not overridden for C
        ac.getString();

        System.out.println();

        System.out.println("objects are initialized!");

        B bb = new B(10, 20, "30");
        B bc = new C(10, 20, "30");

        System.out.println();

        System.out.println("bb  <---------<<<\n");
        bb.getFloat();
        bb.getString(); //not overridden for B
        bb.getDouble();
        bb.getByte();

        System.out.println();

        System.out.println("bc  <---------<<<\n");
        bc.getFloat();
        bc.getString(); //only this overridden for C
        bc.getDouble();
        bc.getByte();

        System.out.println();

        System.out.println("object is initialized!");

        C cc = new C(10, 20, "30");

        System.out.println();

        System.out.println("cc  <---------<<<\n");
        cc.getFloat(); //not overridden for C
        System.out.println("float from C by com.LA.main: " + cc.b);
        cc.getString();
        cc.getDouble(); //not overridden for C
        cc.getByte(); //not overridden for C
    }
}
