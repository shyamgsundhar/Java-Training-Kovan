package org.kovan.intern.oops_and_architectural_thinking.interfaces_and_abstract_classes;

interface As {
    interface Bs {
        void show();
    }
}

class Tests implements As.Bs {
    public void show() {
        System.out.println("Nested Interface");
    }
}

public class NestedInterface {
    public static void main(String[] args) {
        Tests t = new Tests();
        t.show();
    }
}
