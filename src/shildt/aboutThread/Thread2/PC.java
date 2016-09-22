package shildt.aboutThread.Thread2;

/**
 * Created by Tony on 03.06.2016.
 */
public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
    }
}
