package golovach.Threads.WaitNotifySynchronizedTest.Blocked;

/**
 * Created by Tony on 04.06.2016.
 */
public class BlockedMethodCaller implements Runnable{
    private final BlockedSetExample ref;
    private final int k;

    public BlockedMethodCaller(BlockedSetExample ref, int k) {
        this.ref = ref;
        this.k = k;
    }

    @Override
    public void run() {
        try {
            ref.f(k);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
