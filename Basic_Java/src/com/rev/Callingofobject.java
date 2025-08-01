package com.rev;

public class Callingofobject {
	// Fields (object data)
	String name;
	int age;
	
	// Method (object behavior)
	public void sayhello() {
		
		System.out.println("Hello! My name is " + name + " and I am " + age + " years old.");
			
		}
	 // main() method to create object and call method
	
	public static void main(String []args) {
		
		// Creating object of Callingofobject
		Callingofobject obj = new Callingofobject();
		
		 // Setting object values
		obj.name="Shantanu";
		obj.age = 21;
		
		obj.sayhello();
		
		Callingofobject obj1 = new Callingofobject();
		
		obj1.name = "Rohan";
		obj1.age = 17;
		
		obj1.sayhello();
		
		Callingofobject obj2 = new Callingofobject();
		
		obj2.name = "Neel";
		obj2.age = 10;
		
		obj2.sayhello();
		
		
	}
	}
	
	


