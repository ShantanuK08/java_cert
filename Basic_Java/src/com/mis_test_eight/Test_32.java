package com.mis_test_eight;

class LivingThing {
    public void animalMethod() {
        System.out.println("A living thing.");
    }
}

class Animal extends LivingThing {
    public void animalMethod() {
        System.out.print("An animal. ");
        super.animalMethod();
    }
}

class Bird extends Animal {
    public void animalMethod() {
        System.out.print("A Bird. ");
        super.animalMethod();
    }
}

public class Test_32 {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.animalMethod();
    }
}
