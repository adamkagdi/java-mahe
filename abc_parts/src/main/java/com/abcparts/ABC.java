package com.abcparts;

class Branches{
    int bid;
    String name;
    String emi;
    String location;
    int contact;
}

class Parts{
    int pid;
    String pname;
    double pprice;
    String model;
    String quality;
    String brand;
}

class Customers{
    int cid;
    String cname;
    String address;
}

class Suppliers{
    int sno;
    String sname;
    String location;
}

class Brands{
    int bno;
    String bname;
    String origin;
}

class Payments{
    String time;
    String method;
    int amount;
}

class Employees{
    String eid;
    String name;
    int salary;
}

class Stakeholders{
    String name;
    String type;
    String mobileno;
}

class ABC {
    public static void main(String[] args) {
        
        Branches b1=new Branches();
        b1.bid=1;
        b1.name="Excellent ABC Autoparts";
        b1.emi="Dubai";
        b1.location="Al Nahda 2";
        b1.contact=8001010;

        Parts p1=new Parts();
        p1.pid=111;
        p1.pname="tyre";
        p1.pprice=345.6;
        p1.quality="Good";
        p1.model="14cc";
        p1.brand="Dunlop";

        Customers c1=new Customers();
        c1.cid=129;
        c1.cname="Adam Kagdi";
        c1.address="Al Nahda 2";

        Suppliers s1=new Suppliers();
        s1.sno=100;
        s1.sname="Dunlop";
        s1.location="America";

        Brands toyota=new Brands();
        toyota.bno=7008018;
        toyota.bname="Toyota";
        toyota.origin="Japan";

        Payments py1=new Payments();
        py1.time="14:23";
        py1.method="Cash";
        py1.amount=1000;

        Employees emp1=new Employees();
        emp1.eid="E1010";
        emp1.name="Ahmad";
        emp1.salary=100000;

        Stakeholders stk1=new Stakeholders();
        stk1.name="Adam Kagdi";
        stk1.type="Individual";
        stk1.mobileno="0502509140";
    }
}