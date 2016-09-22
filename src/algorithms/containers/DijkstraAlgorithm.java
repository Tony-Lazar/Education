package algorithms.containers;

import java.util.LinkedList;
import java.util.Scanner;

public class DijkstraAlgorithm {
    public static void main(String[] args) {
        LinkedList<String> ops = new LinkedList<>();
        LinkedList<Double> vals = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();

        while (!in.isEmpty()) {
            //pull ops if it exists
            String s = String.valueOf(in.charAt(0));
            if (s.equals("(") || s.equals(" "));
            else if (Character.isDigit(s.charAt(0)))
                vals.push(Double.parseDouble(s));
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                //pop and count result
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) v = vals.pop() + v;
                if (op.equals("-")) v = vals.pop() - v;
                if (op.equals("*")) v = vals.pop() * v;
                if (op.equals("/")) v = vals.pop() / v;
                if (op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            }
            in = in.substring(1);
        }
        System.out.println(vals.pop());
    }
}
