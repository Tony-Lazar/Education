package patterns.decorator.Decorator1;

public abstract class Beverage {
    String description;
    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;

    public String getDescription( ) {
        return description;
    }

    double cost( ) {
        double cost = 0;
        cost += milk ? .20 : 0;
        cost += soy ? .7 : 0;
        cost += mocha ? .35 : 0;
        cost += whip ? .25 : 0;
        return cost;
    }

    boolean hasMilk() {
        return milk;
    }
    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    boolean hasSoy() { return soy; }
    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    boolean hasMocha() { return mocha; }
    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    boolean hasWhip() { return whip; }
    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
