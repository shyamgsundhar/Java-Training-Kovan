package com.kovan.intern.javatraining.model;

public final class Employee {
    public final int id;
    public final String name;
    public final String designation;
    public  Employee(int id,String name, String designation){
        this.id=id;
        this.name=name;
        this.designation=designation;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDesignation(){
        return designation;
    }
}
