package com.multiconstructor;

class Test{
    int x;
    int y;
    Test (int i){
        x = i;
    }
    Test (int i, int j){
        x = i;
        y = j;
    }
    
    void dis(){
        System.out.println("The value of i is " + x);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Test t1 = new Test(4);
        t1.dis();
        Test t2 = new Test(3, 6);
        t2.dis();
    }
}