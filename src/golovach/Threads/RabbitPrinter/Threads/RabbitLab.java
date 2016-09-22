package golovach.Threads.RabbitPrinter.Threads;

/**
 * Created by Tony on 04.06.2016.
 */
public class RabbitLab {
    public static void main(String[] args) {
        new Thread(new RabbitPrinter("0")).start();
    }
}
