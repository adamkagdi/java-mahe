package com.family;

class Car{
    String model;
    int maxspeed;
}
class SportsCar extends Car{
    String tire;
    String purpose;
}

public class Family {
    public static void main(String[] args) {
        Car t1 = new Car();
        t1.model = "Nissan Sunny";
        t1.maxspeed = 200;
        SportsCar t2 = new SportsCar();
        t2.model = "Porsche Tycan";
        t2.maxspeed = 300;
        t2.tire = "Speed softs";
        t2.purpose = "Track car";
    }
}