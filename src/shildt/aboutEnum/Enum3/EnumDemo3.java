package shildt.aboutEnum.Enum3;

/**
 * Created by Tony on 10.06.2016.
 */
public class EnumDemo3 {
    public static void main(String[] args) {
        Apple apple;

        System.out.println("Winesap costs " + Apple.Winesap.getPrice() + " cents. \n");

        System.out.println("All prices: ");
        for (Apple a: Apple.values()) {
            System.out.println(a + " costs " + a.getPrice() + "cents.");
        }
    }
}
