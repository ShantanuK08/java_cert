package com.mistakes;

public class Topclass {
	
	
	public static void main(String [] args) {
		System.out.println("I need main method to run as java application");
		Topclass obj = new Topclass();  // Create object
	    obj.display();                  // Call display method
	}
	void display() {
		System.out.println("I am a Top class");
		
	}

}
//Key of infinite loop concept if Topclass is defined 
//as a new object and called for display inside 
//void display() then it will act as infinite loop.

