package javaphilosophy.innerclasses;

abstract class Base {
    public Base(int i) {
        System.out.println("Constructor Base, i = " + i);
    }
    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("Initialize instance");
            }

            @Override
            public void f( ) {
                System.out.println("unnamed  f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
