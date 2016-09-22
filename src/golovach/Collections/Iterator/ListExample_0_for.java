package golovach.Collections.Iterator;

import java.util.List;

import static java.util.Arrays.asList;

public class ListExample_0_for {
    public static void main(String[] args) {
        List<String> list = asList("A", "B", "C");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
