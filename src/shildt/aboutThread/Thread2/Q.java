package shildt.aboutThread.Thread2;

/**
 * Created by Tony on 03.06.2016.
 */
public class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while(!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException catched");
            }
        System.out.println("Received " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while(valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException catched");
            }
        this.n = n;
        valueSet = true;
        notify();
        System.out.println("Sent " + n);
    }
}
