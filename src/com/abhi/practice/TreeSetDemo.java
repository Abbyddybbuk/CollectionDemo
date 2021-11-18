package com.abhi.practice;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> tString = new TreeSet<String>();
		tString.add("Abhijeet");
		tString.add("abhijeet");
		tString.add("Kulshreshtha");
		tString.add("Ankur");
		tString.add("Abhigyan");
		tString.add("Naman");
		//Null not being possible
//        tString.add(null);
        tString.add("Srinivas");
        
        System.out.println(tString);
        
        TreeSet<Integer> numTSet = new TreeSet<Integer>(new MyIntComparator());
        numTSet.add(10);
        numTSet.add(20);
        numTSet.add(0);
        numTSet.add(50);
        numTSet.add(5);
        numTSet.add(15);
        numTSet.add(70);
        numTSet.add(95);
        
        System.out.println(numTSet);
        
        TreeSet<String> tString1 = new TreeSet<String>(new MyStringComparator());
		tString1.add("Abhijeet");
		tString1.add("Bbhijeet");
		tString1.add("Culshreshtha");
		tString1.add("Dankur");
		tString1.add("Eabhigyan");
		tString1.add("Naman");        
		System.out.println("Sorted List based on Custom Comparator: " + tString1);
	}

}
