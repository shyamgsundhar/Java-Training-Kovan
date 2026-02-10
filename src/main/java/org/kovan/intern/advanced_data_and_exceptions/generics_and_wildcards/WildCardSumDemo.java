package org.kovan.intern.advanced_data_and_exceptions.generics_and_wildcards;

import java.util.Arrays;
import java.util.List;

class WildCard{
    public void addNumbers(List<? extends  Number> list){
        double sum=0;
        for(Number n:list){
            sum+=n.doubleValue();
        }
        System.out.println("The Total is : "+sum);
    }
}
public class WildCardSumDemo {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);
        WildCard wildCard = new WildCard();
        System.out.println("The Integer List");
        wildCard.addNumbers(intList);
        System.out.println();
        System.out.println("The Double List");
        wildCard.addNumbers(doubleList);
    }
}
