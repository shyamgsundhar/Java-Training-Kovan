package org.kovan.intern.advanced_data_and_exceptions.streams_and_lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n->(n%2==0);
        Consumer<String> print = System.out::println;
        Function<Integer,Integer> sq = n->n*n;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(10));
        print.accept("Hello");
        System.out.println(sq.apply(5));
        System.out.println(sq.apply(66));

    }
}
