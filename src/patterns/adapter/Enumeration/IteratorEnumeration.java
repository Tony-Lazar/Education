package patterns.adapter.Enumeration;

import java.util.*;

public class IteratorEnumeration<T> implements Enumeration<T> {
    Iterator<T> iterator;

    public IteratorEnumeration(Iterator<T> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements( ) {
        return iterator.hasNext();
    }

    @Override
    public T nextElement( ) {
        return iterator.next();
    }

    public static class Test {
        public static void main(String[] args) {
            ArrayList<String> list  = new ArrayList<>();
            String[]          array = new String[10];
            for (int i = 0; i < array.length; i++)
                array[i] = "String " + Math.abs(new Random().nextInt());

            list.addAll(Arrays.asList(array));

            IteratorEnumeration<String> iter = new IteratorEnumeration<>(list.iterator());
            while (iter.hasMoreElements()) {
                System.out.println(iter.nextElement());
            }

        }
    }
}
