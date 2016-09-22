package javaphilosophy.typeinfo;

class Candy {
    static {
        System.out.println("loading class Candy");
    }
}

class Gum {
    static {
        System.out.println("loading class Gum");
    }
}

class Cookie {
    static {
        System.out.println("loading class Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("in main()");
        new Candy();
        System.out.println("after creating Candy object");
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("class Gum not found");
        }
        System.out.println("after calling method Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("after creating Cookie object");
    }
}
