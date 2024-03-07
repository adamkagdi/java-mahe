package com.arithmetic;
import java.util.Scanner;


class Math{
    double a;
    double b;

    double addition(){
        return (a + b);
    }
    double subtraction(){
        return (a - b);
    }
    double multiplication(){
        return (a * b);
    }
    double division(){
        return (a / b);
    }
    double remainder(){
        return (a % b);
    }
}

public class Calculation {
    public static void main(String[] args) {
        Math s1 = new Math();
        System.out.println("Please enter number a: ");
        Scanner s = new Scanner(System.in);
        s1.a = s.nextInt();
        System.out.println("Please enter number b: ");
        Scanner f = new Scanner(System.in);
        s1.b = f.nextInt();
        double add = s1.addition();
        double sub = s1.subtraction();
        double multi = s1.multiplication(); 
        double div = s1.division();
        double rem = s1.remainder();
        System.out.println(add);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(rem);
    }
}