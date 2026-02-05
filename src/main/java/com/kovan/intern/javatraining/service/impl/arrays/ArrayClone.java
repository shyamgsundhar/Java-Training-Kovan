package com.kovan.intern.javatraining.service.impl.arrays;

import com.kovan.intern.javatraining.model.Risk;
import org.springframework.stereotype.Service;

@Service
public class ArrayClone {
	public void demonstrate(){
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
	
	// Original main method preserved for reference
	// public static void main(String[] args) {
	// 	ArrayClone ac = new ArrayClone();
	// 	ac.demonstrate();
	// }
}
