package com.kovan.intern.javatraining.service.impl.controlflow;

import org.springframework.stereotype.Service;

@Service
public class SwitchPractice {
	public String execute(int num){
		String result;
		switch(num){
		case 1:
			result = "Hello";
			break;
		case 2:
			result = "Tage";
			break;
		case 3:
			result = "hage";
			break;
		default:
			result = "Type Properly";
			break;
		}
		return result;
	}
	
	// Original main method preserved for reference
	// public static void main(String[] args) {
	// 	Scanner s = new Scanner(System.in);
	// 	int num = s.nextInt();
	// 	SwitchPractice sp = new SwitchPractice();
	// 	System.out.println(sp.execute(num));
	// }
}
