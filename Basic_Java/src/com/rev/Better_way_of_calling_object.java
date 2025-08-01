package com.rev;

public class Better_way_of_calling_object {
	
	String name ;
	int age;
	
	// Constructor to initialize object
	public Better_way_of_calling_object(String name,int age) {
		
		this.name = name;
		this.age = age;

	}
	
	// Method to display information
	public void sayHello() {
        System.out.println("Hello! My name is " + name + " and I am " + age + " years old.");
    }
	
	
	// Main method
	public static void main(String[]args) {
		
		// Creating and using objects
		Better_way_of_calling_object obj1 = new Better_way_of_calling_object("Shantanu", 21);
		Better_way_of_calling_object obj2 = new Better_way_of_calling_object("Rohan", 17);
		Better_way_of_calling_object obj3 = new Better_way_of_calling_object("Neel", 10);
		Better_way_of_calling_object obj4 = new Better_way_of_calling_object("Samrudhi", 18);
		Better_way_of_calling_object obj5 = new Better_way_of_calling_object("Chaitanya", 14);
		
		

        obj1.sayHello();
        obj2.sayHello();
        obj3.sayHello();
        obj4.sayHello();
        obj5.sayHello();
		
		
	}

}
