/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.hw04.q03;

public class Pond {
	// Fields
	private static double radius = 100;
	// Instantiation should be forbidden
	private Pond() {}
	// Since radius of pond is fixed, setter for radius is not needed
	public static double getRadius() {
		return radius;
	}
}
