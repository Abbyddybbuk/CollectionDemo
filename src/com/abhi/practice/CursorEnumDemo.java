package com.abhi.practice;

import java.util.Enumeration;
import java.util.Vector;

public class CursorEnumDemo {

	public static void main(String[] args) {
		Vector<Integer> vNum = new Vector<Integer>();
		
		for (int i=0; i<=20; i++) {
			vNum.add(i);
		}
		
		System.out.println(vNum);
		Enumeration<Integer> eNum = vNum.elements();
		
		while (eNum.hasMoreElements()) {
			Integer num = (Integer) eNum.nextElement();
			if (num%2==0) {
				System.out.println(num);
			}
		}

	}

}
