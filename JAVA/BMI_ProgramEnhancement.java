/*
    Artes, Francesca Q.
    BSCpE 1-1
    
    This program calculates your Body Mass Index (BMI) and show its interpretation.

	JAVA
*/

import java.util.Scanner;

public class BMI_ProgramEnhancement
{
	public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        double weight, height, bmi;
        String interpretation;
        System.out.println("This program calculates your Body Mass Index (BMI) and show its interpretation.");
        System.out.println(" ");
        System.out.print("What is your weight in pounds? ");
        weight = in.nextDouble();
        System.out.print("What is your height in inches? ");
        height = in.nextDouble();
        bmi = bmiCalculation(weight, height);
        interpretation = bmiInterpret(bmi);
        System.out.println("Your Body Mass Index is " + String.format("%.2f", bmi) + ". "  + interpretation);
    }
    public static double bmiCalculation(double weight, double height)
    {
        int constant = 703;
        return (weight * constant / Math.pow(height, 2));
    }
    public static String bmiInterpret(Double bmi)
    {
        if (bmi < 18.5) {return "You are Underweight.";}
        else if (bmi >= 18.5 & bmi <= 24.9) {return "You are in Optimal Weight.";}
        else if (bmi >= 25 & bmi <= 29.9) {return "You are Overweight.";}
        else if (bmi >= 30) {return "You are Obese.";}
        {return "";}
    }
}