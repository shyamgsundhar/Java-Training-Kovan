package org.kovan.intern.oops_and_architectural_thinking.inheritance_and_polymorphism;
class Shapes{
    Shapes draw() {
        return new Shapes();
    }
}

class Circles extends Shapes{
    @Override
    Circles draw() {
        return new Circles();
    }
}

public class CovariantReturnTypesDemo {
    public static void main(String[] args) {
        Shapes s = new Circles();
        Circles c = (Circles) s.draw();
        System.out.println("Covariant return type example");
    }
}
