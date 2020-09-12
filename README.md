# CMSC203_Lab2

import java.util.Scanner;

public class NumericTypes {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Finding average of scores
		final int NUMBER = 2; // number of scores
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		
		
		System.out.println("Input first score: ");
		int scoreOne = sc.nextInt();
		System.out.println("Input second score: ");
		int scoreTwo = sc.nextInt();
		
		average = (scoreOne + scoreTwo) / NUMBER;
		
		System.out.println("The average is " + average);
		
		//
		
		
		//Converting Fahrenheit temperatures to Celsius
		System.out.println("Enter temperature in Farenheit: ");
		double tempF = sc.nextDouble();
		System.out.println("Your input: " + tempF + "° Fahrenheit.");

		fToC = (tempF - 32)*5/9;
		
		System.out.println(tempF + "° in Celcius is " + fToC + "°.");
		
		System.out.println("Goodbye"); // to show that the program is ended	
	
	}
}
