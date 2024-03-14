package com.basic_calculator;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double x = s1.nextDouble();
        System.out.println("Please enter the second number: ");
        double y = s1.nextDouble();
        System.out.println("Which operator do you want to use: \n 1 - Addition \n 2 - Subtraction \n 3 - Multiplication \n 4 - Division");
        int z = s1.nextInt();
        switch (z) {
            case 1:
                System.out.println("The answer is "+ (x+y));
                break;
            case 2:
                System.out.println("The answer is "+ (x - y));
                break;
            case 3:
                System.out.println("The answer is "+ (x * y));
                break;
            case 4:
                System.out.println("The answer is "+ (x / y));
                break;
            default:
                System.out.println("Sorry enter a proper number for the operator (re-run the program)");
                break;
        }
        for(int i=1; i<= 10; i++){
            System.out.println("This is the best calculator I have ever used");
        }
        int p = 1;
        while (p < 10){
            System.out.println(p);
            p++;
        }
    }
}