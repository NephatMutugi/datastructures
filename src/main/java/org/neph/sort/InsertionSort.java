package org.neph.sort;

import java.util.Arrays;

/**
 * @ Author NMuchiri
 **/
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {

        for (int firstUnsorted = 1; firstUnsorted < arr.length; firstUnsorted++) {
            int newElement = arr[firstUnsorted];
            int i;

            for (i = firstUnsorted; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = newElement;
        }

    }

}
