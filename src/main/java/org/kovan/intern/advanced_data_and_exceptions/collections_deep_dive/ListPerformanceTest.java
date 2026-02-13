package org.kovan.intern.advanced_data_and_exceptions.collections_deep_dive;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerformanceTest {
    public static void main(String[] args) {
        int size = 1_000_000;
        int middle_index = size/2;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<size;i++){
            arrayList.add(i);
        }
        long arrayStartTime=System.nanoTime();
        int valueMiddleArray = arrayList.get(middle_index);
        long arrayEndTime = System.nanoTime();
        System.out.println("The Start time of ArrayList: "+arrayStartTime);
        System.out.println("The Middle Value of ArrayList: "+valueMiddleArray);
        System.out.println("The End time of ArrayList: "+arrayEndTime);
        System.out.println("The Difference is "+(arrayEndTime-arrayStartTime));
        System.out.println();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i=0;i<size;i++){
            linkedList.add(i);
        }
        long linkedListStartTime=System.nanoTime();
        int valueMiddleLinkedList = linkedList.get(middle_index);
        long linkedListEndTime = System.nanoTime();
        System.out.println("The Start time of LinkedList: "+linkedListStartTime);
        System.out.println("The Middle Value of LinkedList: "+valueMiddleLinkedList);
        System.out.println("The End time of LinkedList: "+linkedListEndTime);
        System.out.println("The Difference is "+(linkedListEndTime-linkedListStartTime));
    }
}
