package org.kovan.intern.service.javafundamentals.arrays_and_multi_dimensional_logic;

class Risk{
	int id;
	Risk(int id){
		this.id=id;
	}
}
public class ArrayClone{
	public static void main(String[] args) {
		int[] a = {1,2,5,4};
		int[] b = a.clone();
		a[0]=8;
		System.out.println(a[0]);
		System.out.println(b[0]);
		Risk aarr[] = {
			new Risk(59),
			new Risk(60)
		};
		System.out.println(aarr[0].id);
		System.out.println(aarr[1].id);

		Risk barr[]=aarr.clone();
		System.out.println(barr[0].id);
		System.out.println(barr[1].id);

		barr[0].id=58;
		System.out.println(aarr[0].id);
		System.out.println(barr[0].id);
	}
}