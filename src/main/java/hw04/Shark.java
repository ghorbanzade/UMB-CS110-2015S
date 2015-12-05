/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
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
