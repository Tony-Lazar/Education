package golovach.Threads.RabbitPrinter.Threads;

/**
 * Created by Tony on 04.06.2016.
 */
public class RabbitPrinter implements Runnable{
    private String msg;

    RabbitPrinter(String msg) {
        System.out.println("Rabbit " + msg + " created!");
        this.msg = msg;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(500);
            new Thread(new RabbitPrinter(msg + 0)).start();
            new Thread(new RabbitPrinter(msg + 1)).start();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
