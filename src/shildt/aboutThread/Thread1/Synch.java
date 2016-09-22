package shildt.aboutThread.Thread1;

/**
 * Created by Tony on 03.06.2016.
 */
public class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Welcome");
        Caller ob2 = new Caller(target, "in synchronized");
        Caller ob3 = new Caller(target, "world!");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrapted");
        }
    }
}
