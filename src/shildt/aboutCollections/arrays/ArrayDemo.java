package shildt.aboutCollections.arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }

        System.out.print("origin array: ");
        display(array);

        Arrays.sort(array);
        System.out.print("sorted array: ");
        display(array);

        Arrays.fill(array, 2, 6, -1);
        System.out.print("filled array: ");
        display(array);

        Arrays.sort(array);
        System.out.print("sorted array: ");
        display(array);

        System.out.print("-9 is on position: ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }

    public static void display(int array[]) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}
