package com.string_example;

import java.util.Date;

// String Methods

public class Main {
    public static void main(String[] args) {
        String str = "Welcome to Dubai";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(3,7));
        System.out.println(str.charAt(10));
        System.out.println(str.indexOf("D"));
        // Math functions
        System.out.println(Math.abs(-4.5));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.max(4,5));
        System.out.println(Math.min(4, 5));
        System.out.println(Math.log(10));
        System.out.println(Math.exp(-5));
        System.out.println(Math.round(4.5));
        System.out.println(Math.ceil(4.1));
        System.out.println(Math.floor(4.9));
        System.out.println(Math.pow(4,3));
        // Date Functions
        Date dt = new Date();
        System.out.println(dt);
    }
}