package com.rev;

//Parent class (superclass)
class Animal {
 Animal() {
     System.out.println("Animal constructor called");
 }
}

//Child class (subclass)
class Dog extends Animal {
 // Overloaded constructor 1 - no-arg constructor
 Dog() {
     // Calls the overloaded constructor with a string argument
     this("Buddy");
     System.out.println("Dog no-arg constructor called");
 }

 // Overloaded constructor 2 - one argument
 Dog(String name) {
     // super() is called implicitly here (Java inserts it automatically if not written)
     System.out.println("Dog constructor with name: " + name);
 }
}

public class ConstructorExample {
 public static void main(String[] args) {
     Dog d = new Dog();  
 }
}
