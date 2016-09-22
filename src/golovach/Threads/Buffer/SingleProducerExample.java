package golovach.Threads.Buffer;

/**
 * Created by Tony on 05.06.2016.
 */
public class SingleProducerExample {
    public static void main(String[] args) {
        SingleElementBuffer buffer = new SingleElementBuffer();
        new Thread(new Producer(1, 1000, buffer)).start();
        new Thread(new Consumer(buffer)).start();
    }
}
