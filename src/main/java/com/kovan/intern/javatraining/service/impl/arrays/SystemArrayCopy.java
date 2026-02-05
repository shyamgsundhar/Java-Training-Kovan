package com.kovan.intern.javatraining.service.impl.arrays;

import org.springframework.stereotype.Service;

@Service
public class SystemArrayCopy {
	public void demonstrate(){
		int src[] = {1,2,3,4,5,7,8};
		int des[]=new int[3];
		System.arraycopy(src,0,des,0,3);
		for(int i:des){
			System.out.println(i);
		}
	}
	
	// Original main method preserved for reference
	// public static void main(String[] args) {
	// 	SystemArrayCopy sac = new SystemArrayCopy();
	// 	sac.demonstrate();
	// }
}
