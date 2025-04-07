package com.basic;

public class Sparrow extends Animal {

	public Sparrow(int age, String gender, int weight) {
		super(age, gender, weight);
	}

	@Override
	public void move() {
		System.out.println("Sparrow moves");
		
	}

}
