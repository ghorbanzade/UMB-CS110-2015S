/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.hw05.q01;

public class Eagle extends Commercial {
	// attributes
	private static int maxPassenger = 300;
	private static double altitude = 39000;
	private static double speed = 550;
	// methods
	public void board() {
		this.board(1);
	}
	public void board(int num) {
		if (this.getNumPassenger() + num < maxPassenger) {
			super.board(num);
		}
	}
	// constructor
	public Eagle() {
		super(altitude, speed);
		System.out.println("A new eagle!");
	}
	// getters and setters
}
