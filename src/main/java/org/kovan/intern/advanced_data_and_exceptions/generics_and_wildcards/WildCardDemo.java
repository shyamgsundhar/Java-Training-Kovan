package org.kovan.intern.advanced_data_and_exceptions.generics_and_wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {
    public static void printNumbers(List<? extends Number> list){
        for(Number n:list){
            System.out.println(n);
        }
    }
    public static void addNumber(List<? super Integer> list){
        list.add(200);
        list.add(455);
    }
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(59);
        integerList.add(60);
        printNumbers(integerList);
        System.out.println();
        addNumber(integerList);
        System.out.println();
        printNumbers(integerList);
    }
}
