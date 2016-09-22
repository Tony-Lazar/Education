package shildt.aboutGeneric.Generic17;

public class MyGenClass<T extends Number, V> {
    T ob1;
    V ob2;

    void set(T ob1) {
        this.ob1 = ob1;
    }

    void set(V ob2) {
        this.ob2 = ob2;
    }
}
