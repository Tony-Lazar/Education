package shildt.aboutCollections.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        System.out.println("Primary size: " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("al size after adding: " + al.size());

        System.out.println("al contains: " + al);

        al.remove("F");
        al.remove(2);

        System.out.println("al size after removing: " + al.size());
        System.out.println("al contains: " + al);
    }
}
