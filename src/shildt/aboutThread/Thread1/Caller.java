package shildt.aboutThread.Thread1;

/**
 * Created by Tony on 03.06.2016.
 */
public class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme target, String msg) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }
}
