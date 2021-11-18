package com.abhi.practice;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> hString= new LinkedHashSet();
        hString.add("Abhijeet");
        hString.add("Kulshreshtha");
        hString.add("Ankur");
        hString.add("Abhigyan");
        hString.add("Naman");
        hString.add(null);
        hString.add("Srinivas");
        
        System.out.println(hString);


	}

}
