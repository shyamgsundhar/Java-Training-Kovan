package org.kovan.intern.advanced_data_and_exceptions.exception_handling_patterns;

import java.util.Arrays;

public class StackTraceDemo {
    public static void method3(){
       try {
            int a = 10 / 0;
        } catch (Exception e){
           System.out.println(Arrays.toString(e.getStackTrace()));
       }
    }
    public static void method2() {
        method3();
    }
    public static void method1() {
        method2();
    }

    public static void main(String[] args) {
        method1();
    }
}
