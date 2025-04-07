package com.basic;

import java.util.ArrayList;

public class Exercise {

	public static void main(String[] args) {
	ArrayList <String> a = new ArrayList<String>();
	a.add("apple");
	a.add("banana");
	a.add("cherry");
	a.add("mango");
	a.add("apple");
	
	System.out.println(a);
	
	a.remove(0);
	System.out.println(a);
	
	boolean msg = a.contains("orange");
	if(msg== true) {
		System.out.println("orange is found");
	}
	else {
		System.out.println("orange is not found");
	}
	System.out.println(a.size());
	for(int x=0; x<a.size();x++) {
		System.out.println(a.get(x));
	}
	


	
	}

}
