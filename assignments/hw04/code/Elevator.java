//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

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
