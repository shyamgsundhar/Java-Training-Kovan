package com.kovan.intern.javatraining.service.impl.inheritance;

import com.kovan.intern.javatraining.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class ImmutableClassDemo {
    public void demonstrate(){
        Employee employee1= new Employee(01,"Employee1","Manager");
        Employee employee2=new Employee(02,"Employee2","Supervisor");
        System.out.println(employee2.getDesignation());
        System.out.println(employee1.getName());
        //employee1.name="Kovan"; // This would cause compile error - immutable
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     ImmutableClassDemo icd = new ImmutableClassDemo();
    //     icd.demonstrate();
    // }
}
