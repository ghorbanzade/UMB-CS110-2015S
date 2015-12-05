/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.hw05.q01;

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
