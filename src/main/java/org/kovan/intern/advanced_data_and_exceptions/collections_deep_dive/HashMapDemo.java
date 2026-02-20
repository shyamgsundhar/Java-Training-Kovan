package org.kovan.intern.advanced_data_and_exceptions.collections_deep_dive;


public class HashMapDemo {

    public static void main(String[] args) {
        testB();
    }

    static void testB() throws NullPointerException {
        testA("Shyam");
    }

    static public String testA(String s) throws NullPointerException {
        try{
            s=s.replace("S", "A");
            return s;
        }
        catch (NullPointerException npe){
            System.out.println("Execption inside block");
            npe.printStackTrace();
        }
        catch (Exception ipe){
            System.out.println("Execption inside block");
            ipe.printStackTrace();
        }
        return s;
    }
}
