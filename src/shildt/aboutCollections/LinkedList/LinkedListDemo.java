package shildt.aboutCollections.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");

        ll.add(1, "A2");

        System.out.println("Primary ll contains: " + ll);

        ll.remove("F");
        ll.remove(2);
        System.out.println("after removing ll contains: " + ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("after removing last and first ll contains: " + ll);

        String val = ll.get(2);
        ll.set(2, val + " changed");

        System.out.println("after changes ll contains: " + ll);
    }
}
