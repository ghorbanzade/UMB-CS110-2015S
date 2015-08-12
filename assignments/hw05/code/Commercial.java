//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

public abstract class Commercial extends Aircraft {
	// attributes
	private int numPassenger;
	// methods
	public void board(int num) {
		if (this.isGrounded()) {
			numPassenger += num;
			System.out.println(num + " passenger(s) aboard.");
		}
	}
	// constructor
	public Commercial(double altitude, double speed) {
		super(altitude, speed);
		numPassenger = 0;
		System.out.println("A new commercial!");
	}
	// getters and setters
	public int getNumPassenger() {
		return numPassenger;
	}
}
