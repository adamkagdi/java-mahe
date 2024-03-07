package com.patients;

class Patient{
    int id;
    String name;
    int age;
    String gender;
    String bgroup;

}

class ConstructorPatient{
    int pid;
    String name;
    int age;
    String gender;
    String bgroup;
    //constructor part
    ConstructorPatient(int a, String b, int c, String d, String e){
        pid = a;
        name = b;
        age = c;
        gender = d;
        bgroup = e;
    }
}
class Hospital{
    public static void main(String[] args) {
        Patient p1= new Patient();
        p1.id = 1;
        p1.name = "Maheen";
        p1.age = 19;
        p1.gender = "Male";
        p1.bgroup = "A+";

        Patient p2 = new Patient();
        p2.id = 2;
        p2.name = "Aaron";
        p2.age = 20;
        p2.gender = "Male";
        p2.bgroup = "B+";
        
        Patient p3 = p1;

        System.out.println(p3.id);

        ConstructorPatient p4 = new ConstructorPatient(5, "Zaheeruddin", 34, "Male", "O+");

        System.out.println(p4.name);
    }
}