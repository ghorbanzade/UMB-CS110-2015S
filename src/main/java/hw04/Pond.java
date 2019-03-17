/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.hw04.q03;

public class Pond {
	// Fields
	private static double radius = 100;
	// Instantiation should be forbidden
	private Pond() {}
	// Since radius of pond is fixed, setter for radius is not needed
	public static double getRadius() {
		return radius;
	}
}
