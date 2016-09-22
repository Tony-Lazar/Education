package shildt.aboutEnum.Enum2;

/**
 * Created by Tony on 10.06.2016.
 */
public class EnumDemo2 {
    public static void main(String[] args) {
        Apple apple;

        System.out.println("Apple constants");

        Apple allApples[] = Apple.values();
        for (Apple a : allApples) {
            System.out.println(a);
        }

        System.out.println();

        apple = Apple.valueOf("Winesap");
        System.out.println("apple contains ");
    }
}
