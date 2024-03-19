package com.inheritance;

class Students{
    int slcm;
    String name;
    String program;
}
class IntStudents extends Students{
    String nationality;
    String currency;
    String language;
}

public class University {
    public static void main(String[] args) {
        Students Adam = new Students();
        Adam.slcm = 100804545;
        Adam.name = "Adam Huzefa Kagdi";
        Adam.program = "BSc ISM";

        IntStudents Mahdi = new IntStudents();
        Mahdi.slcm = 1010283849;
        Mahdi.name = "Mahdi Abbas";
        Mahdi.program = "Bsc ISM";
        Mahdi.nationality = "African";
        Mahdi.currency = "Shilling";
        Mahdi.language = "Sohaili";

        System.out.println(Mahdi.currency + Mahdi.slcm);
    }
}