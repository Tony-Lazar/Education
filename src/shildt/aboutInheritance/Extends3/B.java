package shildt.aboutInheritance.Extends3;

/**
 * Created by Tony on 02.06.2016.
 */
public class B extends A {
    int k;

    public B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    public void show(String msg) {
        System.out.println(msg + k);
    }
}
