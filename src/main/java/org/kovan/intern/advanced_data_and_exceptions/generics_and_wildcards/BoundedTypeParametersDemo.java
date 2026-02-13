package org.kovan.intern.advanced_data_and_exceptions.generics_and_wildcards;

class SquareCalc<T extends Number>{
    T value;
    SquareCalc(T value){
        this.value=value;
    }

    public double square(){
        return value.doubleValue()*value.doubleValue();
    }
}
public class BoundedTypeParametersDemo {
    public static void main(String[] args) {
        SquareCalc<Integer> squareCalcInteger = new SquareCalc<>(10);
        SquareCalc<Double> squareCalcDouble = new SquareCalc<>(10.3);
        System.out.println(squareCalcInteger.square());
        System.out.println(squareCalcDouble.square());
    }
}
