package org.neph.sort;

/**
 * @ Author NMuchiri
 **/
public class BubbleSort {

    private static void bubbleSort(int[] unsortedArr) {
        int temp;
        int n = unsortedArr.length;
        for (int i = n-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if (unsortedArr[j] > unsortedArr[j + 1]) {
                    temp = unsortedArr[j];
                    unsortedArr[j] = unsortedArr[j + 1];
                    unsortedArr[j + 1] = temp;
                }
            }
        }
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        int count = 0;
        for (int j : arr) {
            count++;
            if (count > 30) {
                System.out.println("\n");
                count = 0;
            }
            System.out.print(" " + j + " ");
        }
        System.out.print("]");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arr = {136, 204, 281, 305, 309, 367, 389, 429, 457, 464,3, 4, 96, 155, 162, 163, 188, 245, 411, 433, 90, 114, 179, 251, 267, 286, 360, 407, 418, 473, 73, 118, 171, 193, 260, 262, 400, 415, 427, 500,
                159, 162, 196, 199, 264, 291, 331, 364, 388, 398, 30, 92, 104, 211, 225, 240, 321, 332, 429, 472, 7, 18, 39, 143, 165, 172, 197, 291, 386, 397, 30,
                78, 121, 201, 281, 410, 429, 432, 467, 471, 33, 75, 96, 101, 107, 166, 239, 269, 289, 325};
        System.out.println("BEFORE THE SORT: ");
        printArray(arr);
        System.out.println("AFTER THE SORT: ");
        bubbleSort(arr);
        printArray(arr);
    }
}
