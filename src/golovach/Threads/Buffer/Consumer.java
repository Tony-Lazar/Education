package golovach.Threads.Buffer;

/**
 * Created by Tony on 05.06.2016.
 */
public class Consumer implements Runnable {
    private final SingleElementBuffer buffer;

    public Consumer(SingleElementBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int elem = buffer.get();
                System.out.println(elem + " consumed");
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
