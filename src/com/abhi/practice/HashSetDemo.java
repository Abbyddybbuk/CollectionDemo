package com.abhi.practice;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hString= new HashSet();
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
