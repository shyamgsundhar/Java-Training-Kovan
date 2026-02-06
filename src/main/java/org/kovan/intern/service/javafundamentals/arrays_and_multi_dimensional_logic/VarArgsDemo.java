package org.kovan.intern.service.javafundamentals.arrays_and_multi_dimensional_logic;

public class VarArgsDemo{
	public static int sumOfAll(int... a){
		int total=0;
		for(int i:a){
			total+=i;
		}
		return total;
	}
	public static void main(String[] args) {
		System.out.println(sumOfAll());
		System.out.println(sumOfAll(1));
		System.out.println(sumOfAll(1,2,3));
	}
}