package org.neph.sort;

/**
 * @ Author NMuchiri
 **/
public class BubbleSort {

    private static void bubbleSort(int[] unsortedArr){
        int temp;
        int n = unsortedArr.length;

        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1; j++){
                if (unsortedArr[j]>unsortedArr[j+1]){
                    temp = unsortedArr[j];
                    unsortedArr[j] = unsortedArr[j+1];
                    unsortedArr[j+1] = temp;
                }
            }
        }
    }

    private static void printArray(int[] arr){
        System.out.print("[");
        for (int i : arr){
            System.out.print(" "+i+" ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, 22, 9, 90};
        System.out.println("BEFORE THE SORT: ");
        printArray(arr);
        System.out.println("AFTER THE SORT: ");
        bubbleSort(arr);
        printArray(arr);
    }
}
