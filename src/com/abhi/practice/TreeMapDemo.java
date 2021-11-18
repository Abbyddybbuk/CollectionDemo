package com.abhi.practice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(101, "XXX");
		tMap.put(99, "YYY");
		tMap.put(222, "AAA");
		tMap.put(11, "BBB");
		
		System.out.println(tMap);
	}

}
