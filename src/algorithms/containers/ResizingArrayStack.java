package algorithms.containers;

import java.util.Iterator;
import java.util.Scanner;

public class ResizingArrayStack<E> implements Iterable<E>{
    private E[] a;
    private int N;

    public ResizingArrayStack(int cap) {
        a = (E[]) new Object[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(E element) {
        if (N == a.length)
            resize(2 * a.length);
        a[N++] = element;
    }

    public E pop() {
        E element = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4)
            resize(a.length / 2);
        return element;
    }

    @Override
    public Iterator<E> iterator( ) {
        return new ReverseArrayIterator();
    }

    private void resize(int max) {
        E[] temp = (E[]) new Object[max];
        System.arraycopy(a, 0, temp, 0, a.length);
        a = temp;
    }

    private class ReverseArrayIterator implements Iterator<E> {
        private int i = N;

        @Override
        public boolean hasNext( ) {
            return i > 0;
        }

        @Override
        public E next( ) {
            return a[--i];
        }

        @Override
        public void remove( ) {

        }
    }

    public static class Client {
        public static void main(String[] args) {
            ResizingArrayStack<String> s;
            s = new ResizingArrayStack<>(100);
            Scanner scanner = new Scanner(System.in);
            String  in      = scanner.nextLine();

            while (!in.isEmpty()) {
                String element = readString(in);
                if (!element.equals("-"))
                    s.push(element);
                else if (!s.isEmpty())
                    System.out.print(s.pop() + " ");
                if (in.length() > element.length())
                    in = in.substring(element.length() + 1);
                else
                    in = in.substring(element.length());
            }

            System.out.println();
            for (String elem : s)
                System.out.println(elem);
            System.out.println("(in stack left " + s.size() + ")");
        }

        private static String readString(String in) {
            String result = "";
            result = in.split(" ")[0];
            return result;
        }
    }
}
