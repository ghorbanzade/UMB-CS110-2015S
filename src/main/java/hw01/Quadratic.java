/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
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
