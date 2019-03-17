/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.q01a.q02;

public class Dice1 {
	public static void main (String[] args) {
		// Generating two random numbers between 0 to 1
		double rand1 = Math.random();
		double rand2 = Math.random();
		// Convert range of random numbers and make them integers
		int randInt1 = (int) (6*rand1 + 1);
		int randInt2 = (int) (6*rand2 + 1);
		System.out.println(randInt1);
		System.out.println(randInt2);
	}
}
