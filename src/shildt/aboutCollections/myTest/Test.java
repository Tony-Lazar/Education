package shildt.aboutCollections.myTest;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int size = 10;
        List<Obj> objs = new ArrayList<>();
        for (int i = 0; i < size; i++)
            objs.add(new Obj());
        System.out.print("show origin list: ");
        show(objs.toArray(new Obj[objs.size()]));
        Obj[] objarr = objs.toArray(new Obj[objs.size()]);
        objarr[2].x = 11;
        objarr[2].y = -11;

        System.out.print("show changed list: ");
        show(objs.toArray(new Obj[objs.size()]));

        System.out.print("show origin array: ");
        show(objarr);
    }

    public static void show(Obj[] objs) {
        for (int i = 0; i < objs.length; i++) {
            System.out.print(objs[i] + " ");
        }
        System.out.println();
    }
}
