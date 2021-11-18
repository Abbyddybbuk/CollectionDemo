package com.abhi.practice;

import java.util.Comparator;

public class MyStringComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}
