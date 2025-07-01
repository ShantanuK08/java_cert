package com.mistakes;

class Dog {
    String name;

    // Constructor
    Dog(String name) {
        this.name = name;
    }

    // Method
    void bark() {
        System.out.println(name + " says Woof!");
    }
}

public class Dog_test {
	public static void main(String [] args) {
		Dog d =new Dog("Bruno");
		d.bark();
		
		
	}

}
