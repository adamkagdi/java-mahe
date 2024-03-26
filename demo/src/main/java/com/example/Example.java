package com.example;

class A{
    int x;
}
class B extends A{
    String y;
}
class C extends B{
    double z;
}

public class Example {
    public static void main(String[] args) {
        C p1 = new C();
        p1.z = 14.4;
        p1.y = "Hello World";
        p1.x = 10;
        System.out.println(p1.x + p1.y + p1.z);
    }
}