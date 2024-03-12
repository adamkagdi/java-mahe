package com.polymorphism;

class Polymorphism{
    int x;
    int y;
    void area(){
        System.out.println("Hello "+ (x+y));
    }
    void area(int i){
        System.out.println(i);
    }
    void area(int i, int j){
        System.out.println(i + j);
    }
    void area(double i){
        System.out.println(i);
    }
}

class TestPoly {
    public static void main(String[] args) {
        Polymorphism p1 = new Polymorphism();
        p1.x = 10;
        p1.y = 11;
        p1.area();
        p1.area(20);
        p1.area(12, 13);
        p1.area(60);
    
    }
}