package com.mistakes;

public class CarTest {

    static class Car {
        String colour;

        Car(String c) {
            colour = c;
        }
    }

    public static void main(String[] args) {
        Car c = new Car("Blue");
        System.out.println(c.colour);
    }
}
