package com.multicalculation;

class PreCalculation{
    double pi;
    
    void area(double r){
        System.out.println("Area of Circle is "+ (pi * r * r));
    }
    void area(int r){
        System.out.println("Area of Square is "+ (r * r));
    }
    void area(double r, double l){
        System.out.println("Area of Rectangle is " + (r * l));
    }
    void area(int r, int l){
        System.out.println("Area of Triange is " + ((r * l)/2));
    }
    void area(double r, double l, double b){
        System.out.println("Area of Trapezium is " + ((r + b)/2 * l));
    }
}

public class Calculation {
    public static void main(String[] args) {
        PreCalculation p1 = new PreCalculation();
        p1.pi = 3.14;
        p1.area(10.5);
        p1.area(11);
        p1.area(6, 5);
        p1.area(11.5, 15.6);
        p1.area(10.5, 12.5, 13.5);
    }
}