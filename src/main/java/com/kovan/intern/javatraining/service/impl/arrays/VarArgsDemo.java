package com.kovan.intern.javatraining.service.impl.arrays;

import org.springframework.stereotype.Service;

@Service
public class VarArgsDemo {
	public static int sumOfAll(int... a){
		int total=0;
		for(int i:a){
			total+=i;
		}
		return total;
	}
	
	// Original main method preserved for reference
	// public static void main(String[] args) {
	// 	System.out.println(sumOfAll());
	// 	System.out.println(sumOfAll(1));
	// 	System.out.println(sumOfAll(1,2,3));
	// }
}
