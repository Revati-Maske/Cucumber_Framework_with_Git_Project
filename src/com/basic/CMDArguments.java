package com.basic;

public class CMDArguments {

	public static void main(String[] args) {
		System.out.println("1st argument is : "+args[0]);
		System.out.println("2nd argument is : "+args[1]);
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int add = a+b;
		System.out.println("Addition of "+args[0]+" & "+args[1]+" is "+add);


	}

}
