package golovach.Threads.WaitNotifySynchronizedTest;

/**
 * Created by Tony on 04.06.2016.
 */
public class Test1 {
    public static void main(String[] args) {
        f();
    }

    private static void f() {
        Class clazz= Test1.class;
        synchronized (clazz) {
            clazz.notify();
        }
    }
}
