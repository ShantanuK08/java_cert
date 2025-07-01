//Default Constructor (no parameters)


package com.mistakes;

class Car {
    String colour;

    Car() {
        colour = "Red";
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.colour);
    }
}
