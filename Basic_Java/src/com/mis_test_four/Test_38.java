package com.mis_test_four;

// RootClass: originally "Parent"
class RootClass {
    String quote = "MONEY DOESN’T GROW ON TREES";  // The target field
}

// MidClass: originally "Child"
class MidClass extends RootClass {
    String quote = "LIVE LIFE KING SIZE";  // Hides RootClass.quote
}

// LeafClass: originally "GrandChild"
class LeafClass extends MidClass {
    String quote = "PLAY PLAY PLAY";  // Hides MidClass.quote
}

public class Test_38 {
    public static void main(String[] args) {
        LeafClass lc = new LeafClass();

        // Field access is based on REFERENCE TYPE, not OBJECT TYPE.

        // Prints: PLAY PLAY PLAY — because lc is of type LeafClass
        System.out.println(lc.quote);

        // ❌ INVALID: System.out.println((RootClass)lc.quote); // Compilation error

        // ✅ Cast object to RootClass, then access quote field → prints MONEY DOESN’T GROW ON TREES
        System.out.println(((RootClass) lc).quote);

        // ✅ Cast to MidClass, then to RootClass — still prints MONEY DOESN’T GROW ON TREES
        System.out.println(((RootClass) (MidClass) lc).quote);

        // ✅ Assign casted object to RootClass reference → field access is based on reference type
        RootClass rc = (RootClass) lc;
        System.out.println(rc.quote); // → MONEY DOESN’T GROW ON TREES
    }
}
