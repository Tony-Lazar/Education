package shildt.aboutCollections.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();

        hm.put("John Dou", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Jain Bayker", 1378.00);
        hm.put("Tod Hall", 99.22);
        hm.put("Ralf Smith", -19.08);

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for (Map.Entry<String, Double> me : set)
            System.out.print(
                    me.getKey() + ": " +
                    me.getValue() + "\n");

        System.out.println();

        double balance = hm.get("John Dou");
        hm.put("John Dou", balance + 1000);
        System.out.println("New John's Dou balance: " + hm.get("John Dou"));
    }
}
