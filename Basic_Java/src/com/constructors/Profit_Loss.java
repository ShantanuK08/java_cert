package com.constructors;

public class Profit_Loss {
    int cp, sp, pr, loss;
    double pp, lp;

    Profit_Loss() {
        cp = 0;
        sp = 0;
    }

    void input(int m, int n) {
        cp = m;
        sp = n;
    }

    void display() {
        if (sp > cp) {
            pr = sp - cp;
            pp = (double) pr / cp * 100;
            System.out.println("The profit percent: " + pp + "%");
        } else if (cp > sp) {
            loss = cp - sp;
            lp = (double) loss / cp * 100;
            System.out.println("The loss percent: " + lp + "%");
        } else {
            System.out.println("No profit, no loss.");
        }
    }

    public static void main(String[] args) {
        Profit_Loss obj = new Profit_Loss();
        obj.input(1000, 1200); 
        obj.display();
    }
}
