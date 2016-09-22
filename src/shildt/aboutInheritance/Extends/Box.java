package shildt.aboutInheritance.Extends;

/**
 * Created by Tony on 02.06.2016.
 */
public class Box {
    private double width;
    private double height;
    private double depth;

    public Box (Box ob) {
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.height;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    public Box(double len) {
        width = height = depth = len;
    }

    public double volume() {
        return width * height * depth;
    }
}
