package shildt.aboutGeneric.Generic10;

public class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<>(88);

        Gen<String> sob = new Gen<>("Generic test");

        Gen raw = new Gen(new Double(98.3));

        double d = (double) raw.getOb();
        System.out.println("value: " + d);

//        int i = (Integer)raw.getOb();

        sob = raw;
//        String str = sob.getOb();

        raw = iob;
//        d = (double) raw.getOb();
    }
}
