package shildt.aboutThread.Thread1;

/**
 * Created by Tony on 03.06.2016.
 */
public class Callme {
    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Interrapted");
        }
        System.out.println("]");
    }
}
