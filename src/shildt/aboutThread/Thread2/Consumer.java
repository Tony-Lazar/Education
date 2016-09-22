package shildt.aboutThread.Thread2;

/**
 * Created by Tony on 03.06.2016.
 */
public class Consumer implements Runnable {
    Q q;
    private boolean isAlive = true;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while (isAlive) {
            if (q.get() > 9)
                isAlive = false;
        }
    }
}
