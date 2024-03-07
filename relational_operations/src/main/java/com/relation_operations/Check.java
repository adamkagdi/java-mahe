package com.relation_operations;

import java.util.Scanner;

class Relational{
    double a;
    double b;
    double x;
    double y;
}
public class Check {
    public static void main(String[] args) {
        Relational r1 = new Relational();
        System.out.println("Please enter number a: ");
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number b: ");
        Scanner f = new Scanner(System.in);
        r1.a = s.nextDouble();
        r1.b = f.nextDouble();
        System.out.println(r1.a == r1.b);
        System.out.println(r1.a != r1.b);
        System.out.println(r1.a > r1.b);
        System.out.println(r1.a < r1.b);
        System.out.println(r1.a >= r1.b);
        System.out.println(r1.a <= r1.b);
        System.out.println(r1.a > r1.b && r1.a > 8);
        System.out.println(r1.b > r1.a || r1.b > 7);
        System.out.println(!(r1.a == r1.b));

        r1.x = 7;
        r1.y = 8;
        r1.x += r1.y;
        System.out.println(r1.x);
    }
}