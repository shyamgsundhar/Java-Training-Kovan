package org.kovan.intern.service.javafundamentals.control_flow_and_algorithmic_logic;

import java.util.*;
public class PrimeSieve{
	public static void main(String[] args) {
		int n=5;
		boolean arr[] = new boolean[n+1];
		Arrays.fill(arr,true);
		arr[0]=false;
		arr[1]=false;
		for(int i=2;(i*i)<=n;i++){
			if(arr[i]){
				for(int j=i*i;j<=n;j=j+i){
					arr[j]=false;
				}
			}
		}
		System.out.println("The Prime Numbers from Starting to "+n+" are ");
		for(int i=2;i<=n;i++){
			if(arr[i])
				System.out.print(i+" ");
		}	
	}
}