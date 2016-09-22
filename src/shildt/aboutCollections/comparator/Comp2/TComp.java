package shildt.aboutCollections.comparator.Comp2;

import java.util.Comparator;

public class TComp implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int i, j, k;
        String aStr, bStr;
        aStr = a;
        bStr = b;

        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k == 0)
            return aStr.compareTo(bStr);
        else
            return k;
    }
}
