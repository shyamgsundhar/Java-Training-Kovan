package org.kovan.intern.advanced_data_and_exceptions.collections_deep_dive;

import java.util.LinkedList;

public class LinkedListBasic {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(12);
        linkedList.add(15);
        for(int i:linkedList){
            System.out.println(i);
        }
        System.out.println();
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println();
        linkedList.remove(1);
        for(int i:linkedList){
            System.out.println(i);
        }
        System.out.println();
        System.out.println(linkedList.get(1));
    }
}
