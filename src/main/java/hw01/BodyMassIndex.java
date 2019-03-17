/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.hw03.q04;

public class BodyMassIndex {
	public static void main (String[] args) {
		// command-line arguments are of String form
		// they should be converted to numbers
		// we convert to double to perform math calculations
		double weight = Double.parseDouble(args[0]);
		double height = Double.parseDouble(args[1]);
		System.out.printf("Weight is %.2f pounds\n",weight);
		System.out.printf("Height is %.2f inches\n",height);
		double BMI = weight * 703 / (Math.pow(height, 2));
		System.out.printf("Your BMI is %.2f\n",BMI);
		// A simple if-elseif-else loop
		// we declare group in advance for better organization
		String group;
		if (BMI < 18.5) {
			group = "Underweight";
		}
		else if (BMI < 24.9) {
			group = "Normal";
		}
		else if (BMI < 29.9) {
			group = "Overweight";
		}
		else {
			group = "Obese";
		}
		System.out.println("According to NIH standards,");
		System.out.println("You are " + group + "!");
	}
}
