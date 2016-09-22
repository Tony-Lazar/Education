package shildt.aboutGeneric.Generic2;

public class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    public Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println(ob.getClass().getName());
    }
}
