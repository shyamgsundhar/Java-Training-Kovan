package org.kovan.intern.service.javafundamentals.control_flow_and_algorithmic_logic;

public class AlphabetPattern{
	public static void main(String[] args) {
		int n=4;
		char x='A';
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}
}