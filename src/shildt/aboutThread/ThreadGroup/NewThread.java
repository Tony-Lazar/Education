package shildt.aboutThread.ThreadGroup;

public class NewThread extends Thread {
    boolean suspendFlag;

    NewThread(String threadname, ThreadGroup threadGroup) {
        super(threadGroup, threadname);
        System.out.println("New thread " + this);
        suspendFlag = false;
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println(getName() + " finished.");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}
