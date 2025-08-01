package com.rev;

public class OverLoadExample {
	
	// Method 1: No parameters
	
	public void greet() {
		System.out.println("Hello!");
	}
	
	// Method 2: One String parameter
	
	public void greet(String name) {
		System.out.println("Hello,"+ name +"!");
		
	}
	
	// Method 3: Two parameters (String and int)
	public void greet(String name, int age) {
		System.out.println("Hello,"+name+ "!(Age:"+age+")");
	}
	
	//Method 4:Parameter order changed
	
	public void greet(int age, String name) {
        System.out.println("Hello, " + name + "! (Age: " + age + ")");
    }
	
	public static void main(String[] args) {
        OverLoadExample obj = new OverLoadExample();

        obj.greet();
        obj.greet("Shantanu");
        obj.greet("Rohan", 17);
        obj.greet(10, "Neel");
    }

}
