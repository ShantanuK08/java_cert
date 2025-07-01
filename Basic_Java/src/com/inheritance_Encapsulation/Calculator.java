package com.inheritance_Encapsulation;

public class Calculator {
    private int result;


    public Calculator() {
        result = 0;
    }

   
    public void add(int a) {
        result += a;
    }

  
    public void sub(int a) {
        result -= a;
    }

  
    public void mul(int a) {
        result *= a;
    }

    
    public void div(int a) {
        if (a != 0) {
            result /= a;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    
    public void display() {
        System.out.println("Current Result: " + result);
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();

    
        calc.add(10);    
        calc.sub(2);       
        calc.mul(3);     
        calc.div(4);      
        calc.display();   
    }
}
