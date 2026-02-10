package com.kovan.intern.javatraining.service.impl.recursion;

import com.kovan.intern.javatraining.model.PassClassDemo;

public class PassByValueTest {
	public static void changeByPrimitive(int x){
		x=59;
		System.out.println("The Value of Change by Primitive is "+ x);
	}
	public static void changeByObject(PassClassDemo passClass){
		passClass.id = 100;
		System.out.println("The Value of changeByObject is "+passClass.id);
	}
	public static void changeByReference(PassClassDemo passClass){
		passClass = new PassClassDemo(10);
		System.out.println("The Value of changeByObject is "+passClass.id);
	}

	// Original main method preserved for reference
	// public static void main(String[] args) {
	// 	PassClassDemo passClassDemo = new PassClassDemo(60);
	// 	int original = 45;
	// 	System.out.println("The Original Priimitive is "+original);
	// 	changeByPrimitive(original);
	// 	System.out.println("The Value of the Object is "+passClassDemo.id);
	// 	changeByObject(passClassDemo);
	// 	System.out.println("The Value of the Object Before changeByReference is "+passClassDemo.id);
	// 	changeByReference(passClassDemo);
	// }
}
