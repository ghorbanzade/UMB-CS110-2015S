/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.hw05.q01;

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
