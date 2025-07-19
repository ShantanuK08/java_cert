package com.mis_test_nine;

interface Friend {
    public String getName(); // ✅ fixed h1: changed from protected to public
}

class Cat implements Friend {
    public String getName() { // ✅ fixed h2: added public
        return "Kitty";
    }
}

class Dog implements Friend {
    public String getName() throws RuntimeException { // ✅ fixed h3: added public
        return "Doggy";
    }
}

// Public class renamed as Test_38
public class Test_38 {
    public static void main(String[] adoption) {
        Friend friend = new Dog(); // h4 — Valid

        // h5 — Will compile, but throws ClassCastException at runtime
        // Uncomment the line below to observe the runtime error
        // System.out.print(((Cat)friend).getName());

        // h6 — Will compile, throws NullPointerException at runtime
        // Uncomment the line below to observe the runtime error
        // System.out.print(((Dog)null).getName());

        // Safe usage
        System.out.println(friend.getName()); // Output: Doggy
    }
}
