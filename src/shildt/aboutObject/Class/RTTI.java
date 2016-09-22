package shildt.aboutObject.Class;

public class RTTI {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Class<?> clObj;
        clObj = x.getClass();
        System.out.println("x - type of: " + clObj.getName());
        clObj = y.getClass();
        System.out.println("y - type of: " + clObj.getName());
        clObj = clObj.getSuperclass();
        System.out.println("super y: " + clObj.getName());
    }
}
