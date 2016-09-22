package algorithms.datastructure.splitonclasses2;

class HighArray {
    private long[] a;
    private int nElems;

    HighArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++)
            if (a[j] == searchKey)
                break;
        if (j == nElems)
            return false;
        return true;
    }

    void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++)
            if (a[j] == value)
                break;
        if (j == nElems)
            return false;
        else {
            System.arraycopy(a, j + 1, a, j, nElems - j);
            nElems--;
            return true;
        }
    }

    long removeMax() {
        if (nElems == 0)
            return -1;
        long max = a[0];
        for (int i = 0; i < nElems; i++)
            if (a[i] > max)
                max = a[i];
        delete(max);
        return max;
    }

    void display() {
        for (int i = 0; i < nElems; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
