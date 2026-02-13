package org.kovan.intern.oops_and_architectural_thinking.classes_statics_and_singleton_pattern;

class InstanceControlTest {
    private static InstanceControlTest instanceControlDemo;
    private InstanceControlTest(){
    }
    public static InstanceControlTest getInstance(){
        if(instanceControlDemo==null) {
            instanceControlDemo = new InstanceControlTest();
        }
        return instanceControlDemo;
    }
}
public class InstanceControlDemo{
    public static void main(String[] args) {
        InstanceControlTest test1= InstanceControlTest.getInstance();
        InstanceControlTest test2= InstanceControlTest.getInstance();
        System.out.println(test1==test2);

    }
}

