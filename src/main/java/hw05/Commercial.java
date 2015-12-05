/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.hw05.q01;

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
