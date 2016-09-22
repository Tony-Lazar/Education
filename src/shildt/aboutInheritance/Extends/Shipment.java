package shildt.aboutInheritance.Extends;

/**
 * Created by Tony on 02.06.2016.
 */
public class Shipment extends BoxWeight{
    double cost;

    public Shipment(Shipment ob) {
        super(ob);
        this.cost = ob.cost;
    }

    public Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
    }

    public Shipment(double weight, double cost) {
        super(weight);
        this.cost = -1;
    }

    public Shipment(double len, double weight, double cost) {
        super(len, weight);
        this.cost = cost;
    }
}
