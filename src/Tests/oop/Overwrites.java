package Tests.oop;

public class Overwrites {
    public interface I {
        int x = 10;
    }

    public static class A implements I{
        int i = 0;

        public int getI( ) {
            return i;
        }
    }

    public static class B extends A {
        int i = 5;

        @Override
        public int getI( ) {
            return i;
        }
    }


    public static class Test {
        public static void main(String[] args) {
            A a = new B();
            System.out.println(a.i);
            System.out.println(a.x);
            System.out.println(a.getI());
            B b = new B();
            System.out.println(b.i);
            System.out.println(b.x);
            System.out.println(a.getI());
        }
    }
}
