package com.abhi.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CursorIteratorDemo {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();

		for (int i = 0; i <= 20; i++) {
			numList.add(i);
		}
		System.out.println(numList);

		Iterator<Integer> itrNum = numList.iterator();

		while (itrNum.hasNext()) {
			Integer num = (Integer) itrNum.next();

			if (num % 2 == 0) {
				System.out.println(num);
			} else {
				itrNum.remove();
			}
		}
		System.out.println(numList);

	}

}
