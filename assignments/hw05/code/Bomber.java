//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

public abstract class Bomber extends Aircraft {
	// attributes
	private int numBombs;
	// methods
	public void dropBomb() {
		if (!this.isGrounded() && numBombs > 0) {
			numBombs--;
			System.out.println("Bomb dropped.");
		}
	}
	// constructor
	public Bomber(double altitude, double speed, int bombs) {
		super(altitude, speed);
		this.numBombs = bombs;
		System.out.println("A new bomber!");
	}
	// getters and setters
	public int getNumBombs() {
		return numBombs;
	}
}
