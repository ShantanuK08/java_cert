package com.rev;

class Calculator{
	// Overloaded method: 2 ints
	int add(int a,int b) {
		return a+b;
	}


//Overloaded method: 3 ints
int add(int a,int b,int c) {
	return a+b+c;
}

//Overloaded method: 2 doubles
double add(double a ,double b) {
	return a+b;
}
}

public class Method_Overloading_Polymorphism {
	
	public static void main(String []args) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(2,3));
		System.out.println(calc.add(2,3,4));
		System.out.println(calc.add(2.4,3.6));
	}

}
