package com.mis_test_five;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super {
    public abstract void m1() throws IOException; 
}

class Sub extends Super {
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException(); // Valid — subclass exception
    }
}

public class Test_26 {
    public static void main(String[] args) {
        Super s = new Sub();
        try {
            s.m1(); // This throws FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.print("X"); //  This catches it
        } catch (IOException e) {
            System.out.print("Y");
        } finally {
            System.out.print("Z");
        }
    }
}















