package org.kovan.intern.advanced_data_and_exceptions.exception_handling_patterns;

class Resource implements AutoCloseable{
    public Resource(){
        System.out.println("Resource Opened");
    }
    public void doWork(){
        System.out.println("Working...");
        throw new RuntimeException("Exception in do work");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Something went Wrong...");
        throw new RuntimeException("Exception in close");
    }
}
public class TryWithResourcesDemo {
    public static void main(String[] args) {
        try(Resource resource = new Resource()){
            resource.doWork();
           // throw new RuntimeException("Something went wrong");
        }catch (Exception e){
            System.out.println("Exception Cached: "+e.getMessage());
            for (Throwable t: e.getSuppressed()){
                System.out.println("Suppressed: "+t);
            }
        }
        System.out.println("Program Continues...");
    }
}
