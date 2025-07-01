// q.no.10

package com.mis_test_four;
//
//interface I01{
//	void m1();
//}
//
//public class Implementer extends Object implements I01 {
//	protected void() {
//		
//	}
//
//}

//Interface method = always public abstract
//Implemented method must be public
//protected void() is invalid — needs a method name!





//corrected program


interface I01 {
    void m1(); // Interface method (implicitly public)
}

public class Implementer extends Object implements I01 {
    // Must be public because interface method is public
    public void m1() {
        System.out.println("m1() implemented");
    }

    public static void main(String[] args) {
        Implementer obj = new Implementer();
        obj.m1();
    }
}
