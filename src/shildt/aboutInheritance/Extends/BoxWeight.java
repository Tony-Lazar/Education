package shildt.aboutInheritance.Extends;

/**
 * Created by Tony on 02.06.2016.
 */
public class BoxWeight extends Box{
    double weight;

    public BoxWeight(BoxWeight ob) {
        super(ob);
        this.weight = ob.weight;
    }

    public BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public BoxWeight(double weight) {
        super();
        this.weight = -1;
    }

    public BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }
}
