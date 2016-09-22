package golovach.Collections.Iterator;

import java.util.Set;
import java.util.TreeSet;

import static java.util.Arrays.asList;

public class SetExample_3_foreach {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(asList("A", "B", "C"));

        for (String elem : set)
            System.out.print(" " + elem);
    }
}
