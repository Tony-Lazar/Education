package shildt.aboutGeneric.Generic11;

public class Gen2<T, V> extends Gen<T> {
    V ob2;

    Gen2(T ob, V ob2) {
        super(ob);
        this.ob2 = ob2;
    }

    V getOb2() {
        return  ob2;
    }
}
