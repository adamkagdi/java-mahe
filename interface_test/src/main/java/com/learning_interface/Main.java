package com.learning_interface;

// interface learning

interface face1{
    public void area();
    public void display();
}

interface face2{
    public void volume();
}

class A{
    int x;
    public void test(){}
}

class B extends A implements face1,face2{
    int y;
    public void area(){}
    public void display(){}
    public void volume(){}
}

public class Main {
    public static void main(String[] args) {
}
}