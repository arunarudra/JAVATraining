package com.oopsConcepts;

public class ChildClass extends Person {
	String profession;
	
	public ChildClass() {
		
	}
	public ChildClass(String name, int age, String prfs) {
		
		super(name,age);
		this.profession=prfs;
		
	}

	public void display() {
		super.display();
		
		System.out.println(name + age + profession);
		System.out.println("Inside Child class");
	}
}
