package com.mis_test_four;

public class Test_47 {
    public static void main(String[] args) {

        // Creates an array of 5 null references to GetSetGo_47
        GetSetGo_47[] arr = new GetSetGo_47[5];

        //  Compile-time error: cannot assign to final variable 'count'
        /*
        for (GetSetGo_47 obj : arr) {
            obj.count++; //  Error: 'count' is final and cannot be modified
        }
        */

        // You can read the value of static final field like this
        System.out.println(GetSetGo_47.count); 
    }
}





//Interface Fields
//Always public static final
//They are constants, not modifiable variables
// Why obj.count++ Fails
//count++ attempts to assign a new value
//But final fields cannot be reassigned
//So compiler blocks it