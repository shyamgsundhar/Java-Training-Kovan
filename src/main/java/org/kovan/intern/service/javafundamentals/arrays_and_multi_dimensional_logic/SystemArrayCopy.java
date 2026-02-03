package org.kovan.intern.service.javafundamentals.arrays_and_multi_dimensional_logic;

public class SystemArrayCopy{
	public static void main(String[] args) {
		int src[] = {1,2,3,4,5,7,8};
		int des[]=new int[3];
		System.arraycopy(src,0,des,0,3);
		for(int i:des){
			System.out.println(i);
		}
	}
}