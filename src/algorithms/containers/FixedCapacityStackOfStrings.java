package algorithms.containers;

import java.util.Scanner;

public class FixedCapacityStackOfStrings {
    private int      N;
    private String[] a;

    public FixedCapacityStackOfStrings(int cap) {
        a = new String[cap];
    }

    public boolean isEmpty( ) {
        return N == 0;
    }

    public int size( ) {
        return N;
    }

    public void push(String item) {
        a[N++] = item;
    }

    public String pop( ) {
        return a[--N];
    }

    public static class Client {
        public static void main(String[] args) {
            FixedCapacityStackOfStrings s;
            s = new FixedCapacityStackOfStrings(100);
            Scanner scanner = new Scanner(System.in);
            String  in      = scanner.nextLine();

            while (!in.isEmpty()) {
                String item = readString(in);
                if (!item.equals("-"))
                    s.push(item);
                else if (!s.isEmpty())
                    System.out.print(s.pop() + " ");
                if (in.length() > item.length())
                    in = in.substring(item.length() + 1);
                else
                    in = in.substring(item.length());
            }
            System.out.println("(in stack left " + s.size() + ")");
        }

        private static String readString(String in) {
            String result = "";
            result = in.split(" ")[0];
            return result;
        }
    }
}
