/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.q01a.q02;

public class Dice2 {
	public static void main (String[] args) {
		// Converting command-line argument to integer
		int maxNum = Integer.parseInt(args[0]);
		// Generating two random numbers between 0 to 1
		double rand1 = Math.random();
		double rand2 = Math.random();
		// Convert range of random numbers and make them integers
		int randInt1 = (int) (maxNum*rand1 + 1);
		int randInt2 = (int) (maxNum*rand2 + 1);
		System.out.println("First random number between 1 and " + maxNum + ": " + randInt1);
		System.out.println("Second random number between 1 and " + maxNum + ": " + randInt2);
	}
}
