package com.mygeometry;

class Math {
    double l;
    double b;
    double h;

    void areaOfRec(){
        System.out.println("The area of the Rectriangle is: "+ (l * b));
    }
    void areaOfSqaure(){
        System.out.println("The area of the Square is: " + (l * l));
    }
    void areaOfCircle(double r){
        System.out.println("The area of the Circle is: " + (3.14 * r * r));
    }
    void areaOfCubiod(){
        System.out.println("The area of th Cuboid is: " + (l*b*h));
    }
    void areaOfTriangle(double b, double h){
        System.out.println("The area of the Triange is: " + 0.5*b*h);
    }
    double areaOfTriangle1(double b, double h){
        return(0.5*b*h);
    }
}

class MyGeometry {
    public static void main(String[] args) {
        Math g1 = new Math();
        g1.l = 12.5;
        g1.b = 15.5;
        g1.h = 17.5;
        g1.areaOfCircle(3.9);
        g1.areaOfSqaure();
        g1.areaOfRec();
        g1.areaOfCubiod();
        double ans = g1.areaOfTriangle1(5,10);
        System.out.println(ans);
    }
}