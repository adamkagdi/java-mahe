package com.controlstatements;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any first number: ");
        double x = s1.nextDouble();
        System.out.println("Enter any second number: ");
        double y = s1.nextDouble();
        if (x > y){
            System.out.println("x is the greatest.");
        }
        else
        if (y > x){
            System.out.println("y is the greatest.");
        }
        else{
            System.out.println("Both are equal values.");
        }
    }
}