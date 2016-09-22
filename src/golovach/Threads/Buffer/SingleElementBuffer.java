package golovach.Threads.Buffer;

/**
 * Created by Tony on 05.06.2016.
 */
public class SingleElementBuffer {
    private Integer elem = null;

    public synchronized void put(Integer newElem) throws InterruptedException {
        while (elem != null)
            this.wait();
        this.elem = newElem;
        this.notifyAll();
    }

    public synchronized Integer get() throws InterruptedException {
        while (elem == null)
            this.wait();
        int result = this.elem;
        this.elem = null;
        this.notifyAll();
        return result;
    }
}
