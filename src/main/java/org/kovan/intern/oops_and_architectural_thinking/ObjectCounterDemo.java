package org.kovan.intern.oops_and_architectural_thinking;

class ObjectCounter{
    private static int count=0;
    private ObjectCounter(){
    }
    public static int getCount(){
        if(count==0) count++;
        System.out.println(System.identityHashCode(count));
        return count;
    }
}
public class ObjectCounterDemo {
    public static void main(String[] args) {
        int objectCounter1= ObjectCounter.getCount();
        int objectCounter2= ObjectCounter.getCount();
        int objectCounter3= ObjectCounter.getCount();
        System.out.println("Total of Objects Created "+ObjectCounter.getCount());
        System.out.println(objectCounter1==objectCounter2);
    }
}
