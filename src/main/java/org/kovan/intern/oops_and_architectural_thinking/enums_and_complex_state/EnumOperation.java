package org.kovan.intern.oops_and_architectural_thinking.enums_and_complex_state;

enum Operation {

    ADD {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },

    SUBTRACT {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },

    MULTIPLY {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    };

    public abstract double apply(double x, double y);
}

public class EnumOperation {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;

        System.out.println(Operation.ADD.apply(a, b));
        System.out.println(Operation.SUBTRACT.apply(a, b));
        System.out.println(Operation.MULTIPLY.apply(a, b));
    }
}
