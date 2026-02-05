package com.kovan.intern.javatraining.service.impl.patterns;

import org.springframework.stereotype.Service;

@Service
public class AlphabetPattern {
	public void generate(int n){
		char x='A';
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}
	
	// Original main method preserved for reference
	// public static void main(String[] args) {
	// 	int n=4;
	// 	AlphabetPattern ap = new AlphabetPattern();
	// 	ap.generate(n);
	// }
}
