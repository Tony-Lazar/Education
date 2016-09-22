package golovach.Collections.Iterator;

import java.util.List;

import static java.util.Arrays.asList;

public class ListExample_3_foreach {
    public static void main(String[] args) {
        List<String> list = asList("A", "B", "C");

        for (String elem : list)
            System.out.print(" " + elem);
    }
}
