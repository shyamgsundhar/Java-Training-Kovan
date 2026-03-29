package org.kovan.intern.service.javafundamentals.methods_and_recursion;

public class StackOverFlowTest{
	public static void stackTest(){
		stackTest();
	}
	public static void main(String[] args) {
		stackTest();
	}
}