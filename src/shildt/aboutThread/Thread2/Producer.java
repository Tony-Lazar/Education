package shildt.aboutThread.Thread2;

/**
 * Created by Tony on 03.06.2016.
 */
public class Producer implements Runnable {
    Q q;
    private boolean isAlive = true;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Provider").start();
    }

    @Override
    public void run() {
        int i = 0;

        while (isAlive) {
            q.put(i++);
            if (i > 10)
                isAlive = false;
        }
    }
}
