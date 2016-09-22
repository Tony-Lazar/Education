package shildt.aboutGeneric.Generic1;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("value: " + v);

        Gen<Double> dOb = new Gen<>(100d);
        dOb.showType();
        double v1 = dOb.getOb();
        System.out.println("value: " + v1);

        System.out.println();

        Gen<String> strOb = new Gen<>("Generic text");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println(str);

//        dOb = iOb;    не будет работать!
    }
}
