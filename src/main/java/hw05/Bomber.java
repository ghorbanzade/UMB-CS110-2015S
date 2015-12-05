/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.hw05.q01;

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
