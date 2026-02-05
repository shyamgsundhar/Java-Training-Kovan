package com.kovan.intern.javatraining.service.impl.patterns;

import org.springframework.stereotype.Service;

@Service
public class BlueJPattern {
    public void generate(String st){
        for(int i=0;i<st.length();i++){
            for(int j=i;j<st.length();j++){
                System.out.print(st.charAt(j)+" ");
            }
            System.out.println();
        }
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     String st = "ABCDE";
    //     BlueJPattern bjp = new BlueJPattern();
    //     bjp.generate(st);
    // }
}
