// Q.No. 32 – Demonstrates Field Hiding and Access Modifier Behavior

package com.mis_test_four;

// Renamed class from Parent → SuperParent
class SuperParent {
    int var = 1000; // Field in SuperParent

    int getVar() {
        return var;  // Returns SuperParent's var
    }
}

// Renamed class from Child → SubChild
class SubChild extends SuperParent {
    private int var = 2000; // Hides SuperParent's var (not override, just hidden)

    @Override
    int getVar() {
        // Accessing parent's var using super
        return super.var;
    }

    // Accessor for SubChild's private var
    public int getChildVar() {
        return var;
    }
}

// Renamed Test class from Test_32 → FieldHidingTest
public class Test_32 {
    public static void main(String[] args) {
        SubChild obj = new SubChild();

        // Access private var of SubChild via public method
        System.out.println("Child's var: " + obj.getChildVar());          // Output: 2000

        // Access parent's var via overridden method
        System.out.println("Parent's var via getVar(): " + obj.getVar()); // Output: 1000
    }
}
