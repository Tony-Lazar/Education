package shildt.aboutGeneric.Generic3;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj =
                new TwoGen<>(88, "Generic");

        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("v = " + v);

        String str = tgObj.getOb2();
        System.out.println("str = " + str );
    }
}
