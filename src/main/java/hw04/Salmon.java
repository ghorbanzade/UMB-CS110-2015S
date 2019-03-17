/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.hw04.q03;

public class Salmon extends Fish {
	private static int numSalmons = 0;
	public Salmon() {
		super();
		setSpeed(10);
		numSalmons++;
	}
	public Salmon(double[] position) {
		super(position);
		setSpeed(10);
		numSalmons++;
	}
	public static int getNumSalmons() {
		return numSalmons;
	}
}
