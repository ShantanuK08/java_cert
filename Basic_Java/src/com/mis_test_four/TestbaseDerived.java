// q.no.6 

//package com.mis_test_four;
//
//
//class Base{
//	protected void m1() {
//		System.out.println("Base m1()");
//	}
//
//	
//}
//class Derived extends Base{
//	void m1() { 					//Here it shows error as Java doesn't allow reducing visibility in overridden methods.
//		System.out.println("Derived:m1()");
//	}
//}
//
//public class TestbaseDerived {
//	public static void main(String []args) {
//		Base b=new Derived();
//		b.m1();
//	}
//
//}

//Derived's m1() has default access.
//Base's m1() is protected (more accessible).
//Fix: Use protected (or public) in Derived's m1().

// Corrected code 
package com.mis_test_four;

class Parent {
    protected void m1() {
        System.out.println("Base m1()");
    }
}

class Derived extends Parent {
    // Access modifier must match or be more visible than the parent
    @Override
    protected void m1() {
        System.out.println("Derived:m1()");
    }
}

public class TestbaseDerived {
    public static void main(String[] args) {
        Parent b = new Derived();
        b.m1();  // Output: Derived:m1()
    }
}
