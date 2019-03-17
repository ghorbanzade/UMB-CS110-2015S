/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.hw04.q03;

public class Shark extends Fish{
	private static int numSharks = 0;
	private int hunger = 0;
	private double range = 20;
	public Shark() {
		super();
		setSpeed(40);
		numSharks++;
	}
	public void move() {
		super.move();
		hunger++;
	}
	public static int getNumSharks() {
		return numSharks;
	}
	public int getHunger() {
		return hunger;
	}
	public void eat() {
		hunger = 0;
	}
	public double getRange() {
		return range;
	}
}
