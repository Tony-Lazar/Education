package algorithms.datastructure.Sort.bubble;

public class ArrayBub {
    private long[] a;
    private int nElems;

    ArrayBub(int max) {
        a = new long[max];
        nElems = 0;
    }

    void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    void display( ) {
        for (int i = 0; i < nElems; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    void bubbleSort() {
        int out, in;
        for (out = nElems - 1; out > 1; out--)
            for (in = 0; in < out; in++)
                if (a[in] > a[in + 1])
                    swap(in, in + 1);

    }

    private void swap(int one, int two) {
        a[one] += a[two];
        a[two]  = a[one] - a[two];
        a[one] -= a[two];
    }
}
