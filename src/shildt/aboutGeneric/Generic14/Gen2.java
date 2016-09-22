package shildt.aboutGeneric.Generic14;

public class Gen2<T> extends Gen<T> {
    public Gen2(T ob) {
        super(ob);
    }

    @Override
    public T getOb() {
        System.out.println("getOb() class Gen2: ");
        return ob;
    }
}
