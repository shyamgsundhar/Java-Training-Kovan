package org.kovan.intern.advanced_data_and_exceptions.streams_and_lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,7,8,8,1,2,3,4,5,6);
        System.out.println("Original List: " + list);
        List<Integer> evenLists = list.stream().filter(n->n%2==0).distinct().map(n->n*n).sorted().toList();
        int count = Math.toIntExact(evenLists.stream().filter(n -> n % 2 == 0).distinct().count());
        boolean anyEven = list.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("Any even? " + anyEven);

        System.out.println(count);
        System.out.println(evenLists);
    }
}
