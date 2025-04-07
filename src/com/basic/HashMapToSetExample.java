package com.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapToSetExample {
	int i= 0;

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Hi");
		hm.put(1, "Hello");
		hm.put(2, "Good Morning");
		hm.put(3, "Good Night");
		System.out.println(hm.get(0));
		Set s= hm.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			Map.Entry mp= (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}


	}
	// for checking access modifiers
	 void getData() {
		System.out.println("Checking access modifier");
	}

}
