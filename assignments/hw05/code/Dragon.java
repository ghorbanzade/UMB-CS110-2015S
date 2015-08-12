//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

public class Dragon extends Bomber {
	// attributes
	private static int maxNumBombs = 2;
	private static double altitude = 30000;
	private static double speed = 1000;
	// methods
	// constructor
	public Dragon() {
		super(altitude, speed, maxNumBombs);
		System.out.println("A new dragon!");
	}
	// getters and setter
}
