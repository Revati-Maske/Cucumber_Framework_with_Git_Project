package com.basic;

public abstract class Animal {
	int age;
	String gender;
	int weight;
	public Animal(int age, String gender, int weight) {
		super();
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		System.out.println("Age : "+age);
		System.out.println("gender : "+gender);
		System.out.println("weight : "+weight);

	}
	public void eat() {
		System.out.println("Eating");
	}
	public abstract void move();

}
