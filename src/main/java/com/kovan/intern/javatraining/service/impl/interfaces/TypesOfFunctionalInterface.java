package com.kovan.intern.javatraining.service.impl.interfaces;

import org.springframework.stereotype.Service;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@Service
public class TypesOfFunctionalInterface {
    public void demonstrate(){
        Supplier<String> carIdSupplier= ()->"Car 101";
        System.out.println(carIdSupplier.get());
        Predicate<Integer> isElite = price -> price>50000;
        System.out.println(isElite.test(25000));
        Function<Integer,Integer> addTax= price->price+(price/100);
        System.out.println(addTax.apply(10000));
        Consumer<String> printDetails = details-> System.out.println(details);
        printDetails.accept("Hello Car");
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     TypesOfFunctionalInterface tofi = new TypesOfFunctionalInterface();
    //     tofi.demonstrate();
    // }
}
