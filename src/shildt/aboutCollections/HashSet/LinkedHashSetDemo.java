package shildt.aboutCollections.HashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<>();

        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");

        System.out.println(hs);
    }
}
