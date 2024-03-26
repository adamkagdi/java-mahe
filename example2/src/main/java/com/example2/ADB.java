package com.example2;

class A{
    int x;
    A(int i){
        x = i;
    }
}
class B extends A{
    int y;
    B(int j, int k){
        super(k);
        y = j;
    }
}
public class ADB {
    public static void main(String[] args) {
        B b1 = new B(4,5);
        System.out.println(b1.x);
        System.out.println(b1.y);
    }
}