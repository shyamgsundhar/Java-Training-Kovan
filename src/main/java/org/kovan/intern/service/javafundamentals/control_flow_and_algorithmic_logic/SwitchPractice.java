package org.kovan.intern.service.javafundamentals.control_flow_and_algorithmic_logic;

import java.util.*;
public class SwitchPractice{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		switch(num){
		case 1:
			System.out.println("Hello");
			break;
		case 2:
			System.out.println("Tage");
			break;
		case 3:
			System.out.println("hage");
			break;
		default:
			System.out.println("Type Properly");
			break;
		}
	}
}