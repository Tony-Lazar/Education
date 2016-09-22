package golovach.Threads.Buffer;

/**
 * Created by Tony on 05.06.2016.
 */
public class Producer implements Runnable {
    private int startValue;
    private final int period;
    private final SingleElementBuffer buffer;

    public Producer(int startValue, int period, SingleElementBuffer buffer) {
        this.startValue = startValue;
        this.period = period;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(startValue + " produced");
                buffer.put(startValue++);
                Thread.sleep(period);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
