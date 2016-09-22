package golovach.Collections.Iterator;

import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;

public class ListExample_1_iter_while {
    public static void main(String[] args) {
        List<String> list = asList("A", "B", "C");

        Iterator<String> iter = list.iterator();
        while(iter.hasNext())
            System.out.print(" " + iter.next());
    }
}