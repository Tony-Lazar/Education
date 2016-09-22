package shildt.aboutInheritance.Extends5;

/**
 * Created by Tony on 02.06.2016.
 */
public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("In triangle district");
        return dim1 * dim2 / 2;
    }
}
