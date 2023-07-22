package com.dev.collectiontest;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList();
		List<String> l2 = new ArrayList();
		l1.add("A");
		l1.add(1,"B");
		//l1.add(1,"C");
		l2.add("A");
		l2.add(1,"B");
		System.out.println(l1.equals(l2));
		
	}

}
