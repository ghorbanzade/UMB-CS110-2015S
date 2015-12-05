/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
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
