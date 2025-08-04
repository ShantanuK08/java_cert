package com.rev;
//Encapsulation: Wrapping data (variables) and methods into a single unit (class)
//Class with encapsulation
class Person{
	// Private variables: Only accessible within this class
	// Private variables (cannot be accessed directly)
	private String name;
	private int age;
	

	// Public setter method (write)
public void setname(String newName) {
	name =newName;
	
}
//Public getter method (read)
public String getname() {
	return name;
}
//Public setter method (write)
public void setAge(int newAge) {
	age=newAge;
}
//Public getter method (read)
public int getAge() {
	return age;
}

}



public class Learning_Encapsulation {
	
	public static void main(String []args) {
		
		Person p = new Person();
		
		p.setname("Krishna");
		p.setAge(25);
		
		System.out.println("Name:"+p.getname());
		System.out.println("Age:"+p.getAge());
		
		
		
	}

}
