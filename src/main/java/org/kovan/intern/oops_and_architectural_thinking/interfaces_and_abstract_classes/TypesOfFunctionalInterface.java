package org.kovan.intern.oops_and_architectural_thinking.interfaces_and_abstract_classes;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TypesOfFunctionalInterface {
    public static void main(String[] args) {
        Supplier<String> carIdSupplier= ()->"Car 101";
        System.out.println(carIdSupplier.get());
        Predicate<Integer> isElite = price -> price>50000;
        System.out.println(isElite.test(25000));
        Function<Integer,Integer> addTax= price->price+(price/100);
        System.out.println(addTax.apply(10000));
        Consumer<String> printDetails = details-> System.out.println(details);
        printDetails.accept("Hello Car");
    }
}
