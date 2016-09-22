package shildt.aboutGeneric.Generic6;

public class Coords<T extends TwoD> {
    T[] coords;

    public Coords(T[] coords) {
        this.coords = coords;
    }
}
