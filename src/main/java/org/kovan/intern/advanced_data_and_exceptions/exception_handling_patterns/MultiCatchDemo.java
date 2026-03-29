package org.kovan.intern.advanced_data_and_exceptions.exception_handling_patterns;

public class MultiCatchDemo {
    public static void main(String[] args) {
        try{
            String st=null;
            System.out.println(st.length());
        }catch (ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("End...");
        }
    }
}
