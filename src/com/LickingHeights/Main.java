package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




    //TODO DECLARE VARIABLES
        double feet, inches, meters, kilograms, bmi, weight;
        double IN_TO_METERS = 0.0254;
        double FT_TO_INCHES = 12;

        Scanner keyboard;


    //TODO INITIALIZE THE VARIABLES WITH USER INPUT
        keyboard = new Scanner (System.in);
        System.out.println("What is your height in feet?");
        feet = keyboard.nextDouble();
        System.out.println("What is your height in inches?");
        inches = keyboard.nextDouble();
        System.out.println("What is your weight in pounds?");
        weight = keyboard.nextDouble();




    //TODO CONVERT VARIABLES TO DO THE EQUATION
        inches = inches + (feet * 12);
        meters = inches * IN_TO_METERS;
        kilograms = (weight * 0.453592);

    //TODO PERFORM BMI CALCULATION
        bmi = kilograms/ (meters * meters);

    //TODO PRINT RESULTS
        

























    }



}
