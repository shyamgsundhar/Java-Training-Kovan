package com.kovan.intern.javatraining.service.impl.controlflow;

import org.springframework.stereotype.Service;

@Service
public class TernaryOperator {
	public String compare(int a, int b){
		return a>b?"A Greater":"B Greater";
	}
	
	// Original main method preserved for reference
	// public static void main(String[] args) {
	// 	int a =10;
	// 	int b=5;
	// 	TernaryOperator to = new TernaryOperator();
	// 	System.out.println(to.compare(a, b));	
	// }
}
