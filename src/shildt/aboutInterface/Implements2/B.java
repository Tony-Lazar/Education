package shildt.aboutInterface.Implements2;

/**
 * Created by Tony on 02.06.2016.
 */
public class B implements A.NestedIF {
    @Override
    public boolean isNotNegative(int x) {
        return x > 0 ? true: false;
    }
}
