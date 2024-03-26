package com.abstract2;

abstract class Dimensions{
    int x;
    int y;
    abstract void area();
}

class A extends Dimensions{
    void area(){
        System.out.println("World");
    }
}

class B extends A{
    void area4(){
        System.out.println("Hello");
    }
}
public class Main {
    public static void main(String[] args) {
        B p1 = new B();
        p1.area4();
    }
}