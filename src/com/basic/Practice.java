package com.basic;

public class Practice {

	public static void main(String[] param) {
		int sum =0;
		for(int i=0; i<param.length; i++) {
			sum = sum + Integer.parseInt(param[i]);
		}
		System.out.println(sum);
		//Practice p1 = new Practice();
		String data=Practice.getData();
		System.out.println(data);

	}
	public static String getData() {
		System.out.println("Hello World!");
		return "Good";
	}

}
