package org.neph;


import java.util.Arrays;
import java.util.Scanner;

public class InverterTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here
        double d = scan.nextDouble();
        String s = scan.next();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    public int solution(int[] A) {
        // Implement your solution here

        Arrays.sort(A);
        int smallestMissing = 1;
        for (int j : A) {
            if (j <= 0)
                continue;
            if (j == smallestMissing)
                smallestMissing++;
            else if (j > smallestMissing)
                return smallestMissing;
        }
        return smallestMissing;
    }
}
