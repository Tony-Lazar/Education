package shildt.aboutGeneric.Generic12;

public class Gen<T> extends NonGen {
    T ob;

    Gen(T ob, int i) {
        super(i);
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}
