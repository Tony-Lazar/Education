package shildt.aboutGeneric.Generic5;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<>(inums);
        double v = iOb.average();
        System.out.println("Average: " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<>(dnums);
        double w = dOb.average();
        System.out.println("Average: " + w);

        Float fnums[] = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Stats<Float> fOb = new Stats<>(fnums);
        double x = fOb.average();
        System.out.println("Average: " + x);

        System.out.println("Averages iOb and dOb");
        if (iOb.sameAvg(dOb))
            System.out.println("equals");
        else
            System.out.println("different");

        System.out.println("Averages iOb and fOb");
        if (iOb.sameAvg(fOb))
            System.out.println("equals");
        else
            System.out.println("different");
    }
}
