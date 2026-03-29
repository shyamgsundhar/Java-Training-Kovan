package org.kovan.intern.oops_and_architectural_thinking.inheritance_and_polymorphism;

final class Employee{
    final int id;
    final String name;
    final String designation;
    public  Employee(int id,String name, String designation){
        this.id=id;
        this.name=name;
        this.designation=designation;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getDesignation(){
        return designation;
    }
}
public class ImmutableClassDemo {
    public static void main(String[] args) {
        Employee employee1= new Employee(01,"Employee1","Manager");
        Employee employee2=new Employee(02,"Employee2","Supervisor");
        System.out.println(employee2.getDesignation());
        System.out.println(employee1.getName());
        //employee1.name="Kovan";
    }
}
