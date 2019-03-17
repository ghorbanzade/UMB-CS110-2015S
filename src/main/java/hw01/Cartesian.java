/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.hw03.q03;

public class Cartesian {
	public static void main (String[] args) {
		// command-line arguments are String
		// they should first be converted to double
		double x, y, z; // declaring cartesian coordinates
		x = Double.parseDouble(args[0]);
		y = Double.parseDouble(args[1]);
		z = Double.parseDouble(args[2]);
		System.out.printf("X is %.2f\n", x);
		System.out.printf("Y is %.2f\n", y);
		System.out.printf("Z is %.2f\n", z);
		// rho, phi and theta are also declared as double
		double rho, phi, theta;
		rho = Math.sqrt( Math.pow(x,2) + Math.pow(y, 2) + Math.pow(z, 2) );
		theta = Math.atan( y / x ) * 180 / Math.PI;
		phi = Math.acos( z / rho) * 180 / Math.PI;
		System.out.printf("Rho is %.3f\n", rho);
		System.out.printf("Phi is %.3f\n", phi);
		System.out.printf("Theta is %.3f\n", theta);
	}
}
