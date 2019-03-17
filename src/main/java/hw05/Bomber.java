/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.hw05.q01;

public abstract class Bomber extends Aircraft {
	// attributes
	private int numBombs;
	// methods
	public void dropBomb() {
		if (!this.isGrounded() && numBombs > 0) {
			numBombs--;
			System.out.println("Bomb dropped.");
		}
	}
	// constructor
	public Bomber(double altitude, double speed, int bombs) {
		super(altitude, speed);
		this.numBombs = bombs;
		System.out.println("A new bomber!");
	}
	// getters and setters
	public int getNumBombs() {
		return numBombs;
	}
}
