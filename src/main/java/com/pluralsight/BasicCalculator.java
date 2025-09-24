package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner BasicCalculator = new Scanner(System.in);
        System.out.print("enter first number: ");
        int firstNumber = BasicCalculator.nextInt();
        BasicCalculator.nextLine();

        System.out.print(" enter second number: ");
        int secondNumber = BasicCalculator.nextInt();
        BasicCalculator.nextLine();

        System.out.print(" Possible calculations: \n (A)dd\n (S)ubtract\n (M)ultiply\n (D)ivide\n ");
        System.out.print(" please select an option: ");
        String option = BasicCalculator.nextLine();

        // System.out.println( firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.printf("%d * %d = %d", firstNumber, secondNumber, (firstNumber * secondNumber));


    }
}
