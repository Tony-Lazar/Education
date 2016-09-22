package shildt.aboutInterface.Implements4;

import java.util.Random;

/**
 * Created by Tony on 02.06.2016.
 */
public class Question implements SharedConstains {
    Random rand = new Random();
    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 30)
            return NO;
        if (prob < 60)
            return YES;
        if (prob < 75)
            return LATER;
        if (prob < 98)
            return SOON;
        else
            return NEVER;
    }
}
