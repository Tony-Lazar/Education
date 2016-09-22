package golovach.Threads.WaitNotifySynchronizedTest.Blocked;

/**
 * Created by Tony on 04.06.2016.
 */
public class BlockedSetExample {
    public static void main(String[] args) throws InterruptedException {
        BlockedSetExample ref = new BlockedSetExample();
        for (int i = 0; i < 5; i++) {
            new Thread(new BlockedMethodCaller(ref, i)).start();
        }
        Thread.sleep(1000);
        ref.create();
    }

    public synchronized void create() throws InterruptedException {
//        synchronized (this) {
            this.notifyAll();
//        }
    }

    public synchronized void f(int x) throws InterruptedException {
        System.out.println("+" + x);
        this.wait();
        System.out.println("-" + x);
    }
}
