package com.abhi.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// LinkedHashMap: Insertion order is preserved
		Map<String, String> hMap = new LinkedHashMap<String, String>();
		hMap.put("1", "Abhijeet");
		hMap.put("2", "Ankur");
		hMap.put("3", "Kulshreshtha");
		hMap.put("4", "Ramesh");
		
		System.out.println(hMap);

	}

}
