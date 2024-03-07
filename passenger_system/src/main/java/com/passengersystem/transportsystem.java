package com.passengersystem;

class Bus{
    int bid;
    String btype;
    String destination;
}

class Driver{
    int empid;
    String gender;
    String destination;
}
class Passenger{
    int pid;
    String gender;
    String destination;
}

class TransportSystem {
    public static void main(String[] args) {
        Passenger Zaheeruddin=new Passenger();
        Zaheeruddin.pid=100;
        Zaheeruddin.gender="Male";
        Zaheeruddin.destination="Al Fisht, Sharjah";

        Driver Sardar=new Driver();
        Sardar.empid=001;
        Sardar.gender="Male";
        Sardar.destination="Sharjah";

        Bus Toyota=new Bus();
        Toyota.bid=100;
        Toyota.btype="Coaster";
        Toyota.destination="Sharjah";
        
        System.out.println(Zaheeruddin.pid);
    }
}