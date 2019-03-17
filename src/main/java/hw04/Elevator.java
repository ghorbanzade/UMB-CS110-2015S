/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.hw04.q02;

public class Elevator {
	private static int floor;
	private final static int limitUp = 10;
	private final static int limitDown = -2;
	private Elevator() { floor = 0; }
	protected static void go(int level) {
		int dest = floor + level;
		if (dest <= limitUp && dest >= limitDown) {
			floor += level;
		}
		else {
			System.out.println("Impossible!");
		}
	}
	protected static void currentLevel() {
		System.out.println("Elevator is at floor "+floor);
	}
}
