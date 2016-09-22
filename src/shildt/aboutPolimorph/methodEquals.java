package shildt.aboutPolimorph;

/**
 * Created by Tony on 01.06.2016.
 */
public class methodEquals {
    public static void main(String[] args) {
//        Float f1 = shildt.aboutInheritance Float(Float.NaN);
        Float f1 = +0.0f;
//        Float f2 = shildt.aboutInheritance Float(Float.NaN);
        Float f2 = -0.0f;
//        System.out.println("" + (f1 == f2) + " " + f1.equals(f2) + " " + (Float.NaN == Float.NaN));
        System.out.println("" + (f1 == f2) + " " + f1.equals(f2) + " " + (0.0f == -0.0f));
    }
}
