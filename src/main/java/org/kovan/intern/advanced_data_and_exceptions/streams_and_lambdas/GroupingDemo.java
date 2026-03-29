package org.kovan.intern.advanced_data_and_exceptions.streams_and_lambdas;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingDemo {
    enum Department{
        IT, SALES, HR
    }
    static class Employee {
        private String name;
        private Department department;

        public Employee(String name, Department department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public Department getDepartment() {
            return department;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Ravi", Department.IT),
                new Employee("Kumar", Department.IT),
                new Employee("Anu", Department.HR),
                new Employee("Priya", Department.SALES),
                new Employee("Vijay", Department.SALES)
        );
        Map<Department,List<Employee>> groupmap = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        groupmap.forEach((dept,empList)->{
            System.out.println("Department: "+dept);
            empList.forEach(emp-> System.out.println(emp.getName()));
        });
    }
}
