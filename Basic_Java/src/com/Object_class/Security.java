// To calculate the wages of employees

package com.Object_class;

class Security {
    String n;
    int h;
    double r, w;

    public void get(String name, int hour, double rate) {
        n = name;
        h = hour;
        r = rate;
    }

    public void calwage() {
        if (h <= 40)
            w = r * h; 
        else if (h <= 60)
            w = (h - 40) * 1.5 * r + 40 * r;
        else
            w = (20 * 1.5 * r) + (40 * r);
    }

    public void display() {
        System.out.println("Name\tHours\tWage");
        System.out.println(n + "\t" + h + "\t" + w);
    }

    
    public static void main(String[] args) {
        Security emp1 = new Security();
        emp1.get("John", 45, 100); 
        emp1.display();
    }
}
