/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.hw04.q03;

public class Salmon extends Fish {
	private static int numSalmons = 0;
	public Salmon() {
		super();
		setSpeed(10);
		numSalmons++;
	}
	public Salmon(double[] position) {
		super(position);
		setSpeed(10);
		numSalmons++;
	}
	public static int getNumSalmons() {
		return numSalmons;
	}
}
