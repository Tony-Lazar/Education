package shildt.aboutInterface.Implements;

/**
 * Created by Tony on 02.06.2016.
 */
public class AnotherClient implements Callback {
    @Override
    public void callback(int param) {
        System.out.println("One more version callback");
        System.out.println("p^2 = " + (param * param));
    }
}
