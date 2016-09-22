package shildt.aboutPolimorph;

/**
 * Created by Tony on 01.06.2016.
 */
class Super {
    static String ID = "QBANK";
}

class Sub extends Super {
    static {
        System.out.println("In Sub");
    }
}

public class classExtending {
    public static void main(String[] args) {
        System.out.println(Sub.ID);
    }
}
