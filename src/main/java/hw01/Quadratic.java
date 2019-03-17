/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.hw03.q05;

public class Quadratic {
	public static void main(String[] args) {
		double a, b, c; // declaring coefficients
		// Convering command-line arguments to double
		a = Double.parseDouble(args[0]);
		b = Double.parseDouble(args[1]);
		c = Double.parseDouble(args[2]);
		// Calculating discriminant
		double discriminant = Math.pow(b, 2)-4*a*c;
		if (discriminant > 0) {
			double sol1 = (- b + Math.sqrt(discriminant))/(2*a);
			double sol2 = (- b - Math.sqrt(discriminant))/(2*a);
			System.out.printf("Solutions are %.3f and %.3f\n", sol1, sol2);
		}
		else if (discriminant == 0) {
			double sol = -b/2/a;
			System.out.printf("Solution is %.3f\n", sol);
		}
		else {
			System.out.println("No Real-number solution exists");
		}
	}
}
