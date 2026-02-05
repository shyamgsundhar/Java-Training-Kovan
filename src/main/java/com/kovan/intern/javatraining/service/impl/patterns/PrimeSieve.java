package com.kovan.intern.javatraining.service.impl.patterns;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PrimeSieve {
	public int[] generatePrimes(int n){
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
		
		// Count primes
		int count = 0;
		for(int i=2;i<=n;i++){
			if(arr[i]) count++;
		}
		
		// Collect primes
		int[] primes = new int[count];
		int index = 0;
		for(int i=2;i<=n;i++){
			if(arr[i]) primes[index++] = i;
		}
		
		return primes;
	}
	
	public void printPrimes(int n){
		int[] primes = generatePrimes(n);
		System.out.println("The Prime Numbers from Starting to "+n+" are ");
		for(int prime : primes){
			System.out.print(prime+" ");
		}
		System.out.println();
	}
	
	// Original main method preserved for reference
	// public static void main(String[] args) {
	// 	int n=5;
	// 	PrimeSieve ps = new PrimeSieve();
	// 	ps.printPrimes(n);
	// }
}
