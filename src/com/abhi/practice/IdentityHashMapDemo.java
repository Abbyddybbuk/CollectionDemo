package com.abhi.practice;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> nameMap = new IdentityHashMap<Integer, String>();
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(10);
		
		nameMap.put(num1, "Abhijeet");
		nameMap.put(num2, "Ankur");
        
		System.out.println(nameMap);
	}

}
