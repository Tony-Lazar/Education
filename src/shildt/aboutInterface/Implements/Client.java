package shildt.aboutInterface.Implements;

/**
 * Created by Tony on 02.06.2016.
 */
public class Client implements Callback {
    @Override
    public void callback(int param) {
        System.out.println("method callback, called with param: " + param);
    }

    void nonIfaceMeth() {
        System.out.println("Another method from Cliend");
    }
}
