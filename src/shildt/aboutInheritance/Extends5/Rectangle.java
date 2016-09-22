package shildt.aboutInheritance.Extends5;

/**
 * Created by Tony on 02.06.2016.
 */
public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("In rectangle district");
        return dim1 * dim2;
    }
}
