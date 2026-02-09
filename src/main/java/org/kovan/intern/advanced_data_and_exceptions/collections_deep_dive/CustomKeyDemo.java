package org.kovan.intern.advanced_data_and_exceptions.collections_deep_dive;

import java.util.HashMap;
import java.util.Objects;

class Person{
    String name;
    Person(String name){
        this.name=name;
    }

    @Override
    public boolean equals(Object object){
        Person person = (Person) object;
        return this.name.equals(person.name);
    }

    @Override
    public  int hashCode(){
        return Objects.hash();
    }
}
public class CustomKeyDemo {
    public static void main(String[] args) {
        HashMap<Person,Integer> hashMap= new HashMap<>();
        Person person1= new Person("Kovan");
        Person person2=new Person("Kovan");
        hashMap.put(person1,100);
        hashMap.put(person2,105);
        System.out.println(hashMap.size());
        System.out.println(hashMap.get(person2));
    }
}
