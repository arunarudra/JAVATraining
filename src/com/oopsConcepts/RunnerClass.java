package com.oopsConcepts;

public class RunnerClass {

	public static void main(String[] args) {
		
		Person per1 = new Person();
		Person per2 = new ChildClass("scooby",9,"dog");
		ChildClass child1 = new ChildClass();
		ChildClass child2=new ChildClass("Aruna",45,"IT");
		
		//child1.display();
		//child2.display();
		per2.display();
		
		// overloading example
		
		OverloadingExample ovexample1 = new OverloadingExample();
		ovexample1.sum(2,3,8);
		ovexample1.sum(10, 15);
		
		//interface example
		IciciBank bank1 = new IciciBank();
		bank1.welcome();
		
		//Encapsulation example
		EncapsulationExample encap = new EncapsulationExample();
		encap.setName("Scooby");
		String name = encap.getName();
		System.out.println(name);
		encap.setCompany("Technotarium");
		String company = encap.getCompany();
		System.out.println(company);
			
		}
		

	}


