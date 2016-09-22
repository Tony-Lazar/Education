package shildt.aboutGeneric.Generic4;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<>(inums);
        double v = iOb.average();
        System.out.println("Average : " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<>(dnums);
        v = dOb.average();
        System.out.println("Average: " + v);
    }
}
