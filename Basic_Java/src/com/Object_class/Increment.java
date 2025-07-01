package com.Object_class;

class Increment {
    String name;
    int age;
    double basic;

    public void getdata(String n, int a, double b) {
        name = n;
        age = a;
        basic = b;
    }

    public void calculate() {
        double inc = 0.0;
        if (age >= 56)
            inc = basic * 20.0 / 100.0;
        else if (age > 45)
            inc = basic * 15.0 / 100.0;
        else
            inc = basic * 10.0 / 100.0;

        basic = basic + inc; // Update the basic with increment
    }

    public void display() {
        System.out.println("Name\tAge\tUpdated Basic");
        System.out.println(name + "\t" + age + "\t" + basic);
    }

    public static void main(String[] args) {
        Increment emp = new Increment();
        emp.getdata("John", 50, 50000);
        emp.calculate();
        emp.display();
    }
}
