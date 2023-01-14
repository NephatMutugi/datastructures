package org.neph.sort;

import java.util.Arrays;

/**
 * @ Author NMuchiri
 **/
public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {20,35,-15, 7,55, 1, -22};

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int [] arr){
        int arrLen = arr.length;
        for (int i=arrLen-1; i>0;i--){
            int largest = 0;
            for (int j = 1; j <= i;j++){
                if (arr[j] > arr[largest]){
                    largest = j;
                }
            }

            swap(arr, largest, i);
        }
    }

    private static void swap(int[] arr, int i, int j){
        if (i==j)
            return;

        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
