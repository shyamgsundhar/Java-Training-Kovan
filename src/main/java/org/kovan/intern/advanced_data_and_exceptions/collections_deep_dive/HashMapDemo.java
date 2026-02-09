package org.kovan.intern.advanced_data_and_exceptions.collections_deep_dive;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Ravi", 100);
        map.put("Kumar", 200);
        map.put("Ajay", 300);

        System.out.println(map);
        System.out.println("Ravi marks: " + map.get("Ravi"));
        System.out.println("Ravi marks: " + (map.hashCode()&(16-1)));
    }
}
