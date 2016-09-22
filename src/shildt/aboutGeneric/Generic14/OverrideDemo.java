package shildt.aboutGeneric.Generic14;

public class OverrideDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);

        Gen<Integer> iOb2 = new Gen2<>(99);

        Gen<String> strOb2 = new Gen2<>("Generic test");
        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());
    }
}
