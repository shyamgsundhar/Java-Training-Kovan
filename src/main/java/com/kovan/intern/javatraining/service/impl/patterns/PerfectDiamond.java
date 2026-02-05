package com.kovan.intern.javatraining.service.impl.patterns;

import org.springframework.stereotype.Service;

@Service
public class PerfectDiamond {
	public void generate(int m){
       int n=m/2;
       for(int i=0;i<=n;i++){
           for(int j=0;j<n-i;j++){
               System.out.print(" ");
           }
           for(int j=0;j<(2*i)+1;j++){
               System.out.print("*");
           }
           System.out.println();
       }
       for(int i=n-1;i>=0;i--){
           for(int j=0;j<n-i;j++){
               System.out.print(" ");
           }
           for(int j=0;j<(2*i)+1;j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
    
    // Original main method preserved for reference
    // public static void main(String[] args) {
    //     int m=7;
    //     PerfectDiamond pd = new PerfectDiamond();
    //     pd.generate(m);
    // }
}
