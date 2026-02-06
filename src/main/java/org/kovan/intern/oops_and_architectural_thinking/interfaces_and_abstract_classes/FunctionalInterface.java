package org.kovan.intern.oops_and_architectural_thinking.interfaces_and_abstract_classes;

@java.lang.FunctionalInterface
interface Square{
    int calculate(int x);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        int x=41;
        Square s = (int a)->a*a;
        int ans = s.calculate(x);
        System.out.println(ans);
    }
}
