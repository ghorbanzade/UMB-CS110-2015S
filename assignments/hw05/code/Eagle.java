//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

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
