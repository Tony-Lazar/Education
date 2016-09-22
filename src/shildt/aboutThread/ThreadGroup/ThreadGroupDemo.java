package shildt.aboutThread.ThreadGroup;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");

        NewThread ob1 = new NewThread("One", groupA);
        NewThread ob2 = new NewThread("Two", groupA);
        NewThread ob3 = new NewThread("Three", groupB);
        NewThread ob4 = new NewThread("Four", groupB);

        System.out.println("\nOutput from list(): ");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("interrupt group A");
        Thread tga[] = new Thread[groupA.activeCount()];
        groupA.enumerate(tga);

        for (int i = 0; i < tga.length; i++) {
            ((NewThread)tga[i]).mysuspend();
        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Exception");
        }

        System.out.println("Notify Group A");

        for (int i = 0; i < tga.length; i++) {
            ((NewThread)tga[i]).myresume();
        }

        try {
            System.out.println("Fait method finish...");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (InterruptedException e) {
        }
        System.out.println("Exception");
    }
}
