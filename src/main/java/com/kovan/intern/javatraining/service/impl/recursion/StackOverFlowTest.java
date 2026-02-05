package com.kovan.intern.javatraining.service.impl.recursion;

import org.springframework.stereotype.Service;

@Service
public class StackOverFlowTest {
	public static void stackTest(){
		stackTest();
	}
	
	// Original main method preserved for reference
	// public static void main(String[] args) {
	// 	stackTest();
	// }
}
