package shildt.aboutInheritance.Extends5;

/**
 * Created by Tony on 02.06.2016.
 */
public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Area isn't initialized.");
        return 0;
    }
}
