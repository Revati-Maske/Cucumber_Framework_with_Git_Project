package com.basic;

public class MethodDemo {

	public static void main(String[] args) {
		String data = getData();
		System.out.println(data);
	}
	public static String getData() {
		System.out.println("Hello World");
		return "Good afternoon";
	}
}
