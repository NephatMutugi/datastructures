package org.neph.generics;

import java.util.ArrayList;

/**
 * @ Author NMuchiri
 **/
public class Generics {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n){
        for (Integer i : n){
            System.out.println(i *2);
        }
    }
}
