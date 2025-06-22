package com.methods;
import java.util.*;

public class Compute {
    double vc = 0.0D, vs = 0.0D, vcd = 0.0D;

    void volume(int s) {
        vc = s * s * s;
        System.out.println("The volume of a cube = " + vc);
    }

    void volume(float r) {
        vs = (4.0 / 3) * (22.0 / 7) * r * r * r;
        System.out.println("The volume of a sphere = " + vs);
    }

    void volume(int l, int b, int h) {
        vcd = l * b * h;
        System.out.println("The volume of a cuboid = " + vcd);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int s, l, b, h;
        float r;

        System.out.println("Enter the side of a cube:");
        s = in.nextInt();

        System.out.println("Enter the radius of a sphere:");
        r = in.nextFloat();

        System.out.println("Enter the length, breadth, and height of a cuboid:");
        l = in.nextInt();
        b = in.nextInt();
        h = in.nextInt();

        Compute ob = new Compute();
        ob.volume(s);
        ob.volume(r);
        ob.volume(l, b, h);

        in.close();
    }
}
