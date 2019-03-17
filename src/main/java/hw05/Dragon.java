/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.hw05.q01;

public class Dragon extends Bomber {
	// attributes
	private static int maxNumBombs = 2;
	private static double altitude = 30000;
	private static double speed = 1000;
	// methods
	// constructor
	public Dragon() {
		super(altitude, speed, maxNumBombs);
		System.out.println("A new dragon!");
	}
	// getters and setter
}
