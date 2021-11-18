package com.abhi.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> nameMap = new HashMap<String, String>();
		nameMap.put("1", "Abhijeet");
		nameMap.put("2", "Ankur");
		System.out.println(nameMap);
		System.out.println(nameMap.put("1", "Test"));
		
		System.out.println(nameMap.get("1"));
		
		Set<Entry<String, String>> hSet = new TreeSet<>();
		hSet = nameMap.entrySet();
		System.out.println(hSet);
		
		System.out.println(nameMap.keySet());
		
		System.out.println(nameMap.values());

	}

}
