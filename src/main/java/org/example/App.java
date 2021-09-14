/**
 * UCF COP3330 Fall 2021 Assignment 18 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);
        String unit;
        double c, f;

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your Choice: ");
        unit = scnr.next();

        if (unit.equalsIgnoreCase("C")) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            f = scnr.nextDouble();

            c = (f - 32) * 5 / 9;

            System.out.println("The temperature in Celsius is " + c);
        }
        else if (unit.equalsIgnoreCase("F")) {
            System.out.print("Please enter the temperature in Celsius: ");
            c = scnr.nextDouble();

            f = (c * 9 / 5) + 32;

            System.out.println("The temperature in Fahrenheit is: " + f);
        }
    }
}
