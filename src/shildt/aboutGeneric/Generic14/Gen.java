package shildt.aboutGeneric.Generic14;

public class Gen<T> {
    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        System.out.println("getOb() class Gen: ");
        return ob;
    }
}
