//q.no 13 

package com.mis_test_four;

abstract class Animal{
	private String name;
	Animal(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
}

class Dog extends Animal{
	private String breed;
	// Fix: Call super with a default name
    Dog(String breed) {
        super("Unknown");  // or any default value
        this.breed = breed;
    
	}
	Dog(String name, String breed) {
		super(name);
		this.breed = breed;
		}
	public String getBreed() {
		return breed;
	}
}


public class Test_13 {
	public static void main(String args[]) {
		Dog dog1=new Dog("Beagle");
		Dog dog2=new Dog("Bubbly,Poodle");
		System.out.println(dog1.getName()+":"+dog1.getBreed()+":"+ dog2.getName() + ":" + dog2.getBreed());
	}

}
