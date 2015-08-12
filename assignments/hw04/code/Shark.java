//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

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
