/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.q01a.q01;

public class Daltons {
	public static void main (String[] args) {
		boolean result = false;
		// Check if brothers are from shortest to tallest
		if (args[0].equals("Joe") && args[1].equals("William") && args[2].equals("Jack") && args[3].equals("Averell")) {
			result = true;
		}
		// Check if brothers are from tallest to shortest
		else if (args[0].equals("Averell") && args[1].equals("Jack") && args[2].equals("William") && args[3].equals("Joe")) {
			result = true;
		}
		System.out.println(result);
	}
}
