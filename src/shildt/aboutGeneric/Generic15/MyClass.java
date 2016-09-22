package shildt.aboutGeneric.Generic15;

public class MyClass<T, V> {
    T ob1;
    V ob2;

    public MyClass(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    boolean isSame(MyClass<T, V> ob) {
        if (ob1 == ob.ob1 && ob2 == ob.ob2) return true;
        return false;
    }

    public static void main(String[] args) {
        MyClass<Integer, String> mcOb = new MyClass<>(98, "A String");

        if (mcOb.isSame(new MyClass<>(1, "test")))
            System.out.println("Same");

        MyClass<A<Integer, Long>, String> mcOb2 = new MyClass<A<Integer, Long>, String>(new B<Integer, Long>(), "Generic");
//        MyClass<A<Integer, Long>, String> mcOb3 = new MyClass<>(new B<Integer, Long>(), "Generic"); /*Не сработает*/
    }
}
