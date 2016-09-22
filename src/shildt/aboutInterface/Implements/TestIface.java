package shildt.aboutInterface.Implements;

/**
 * Created by Tony on 02.06.2016.
 */
public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(42);
        c = ob;
        c.callback(42);
    }
}
