/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.hw05.q01;

public abstract class Commercial extends Aircraft {
	// attributes
	private int numPassenger;
	// methods
	public void board(int num) {
		if (this.isGrounded()) {
			numPassenger += num;
			System.out.println(num + " passenger(s) aboard.");
		}
	}
	// constructor
	public Commercial(double altitude, double speed) {
		super(altitude, speed);
		numPassenger = 0;
		System.out.println("A new commercial!");
	}
	// getters and setters
	public int getNumPassenger() {
		return numPassenger;
	}
}
