package org.kovan.intern.advanced_data_and_exceptions.collections_deep_dive;

import java.util.ArrayList;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(15);
        for(int i:arrayList){
            System.out.println(i);
        }
        System.out.println();
        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.getLast());
        System.out.println();
        arrayList.remove(1);
        for(int i:arrayList){
            System.out.println(i);
        }
    }
}
