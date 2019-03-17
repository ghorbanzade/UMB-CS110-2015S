/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.q03a.q01;

public class Theater {
	// First, let's define attributes of the Theater
	// We use private access modifier to perform encapsulation
	// Number of available seats
	private static int availableSeats;
	// State of seats of theater: true if available, false if already sold
	private static boolean[][] seats = new boolean[5][10];
	// Number of available seats in each row
	private static int[] availableSeatsInRow = new int[seats.length];
	// Now, it's time for Methods
	// This method sets all seats to false and initializes available seats
	public static void initialize() {
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				seats[i][j] = false;
			}
		}
		for (int i = 0; i < seats.length; i++) {
			availableSeatsInRow[i] = seats[0].length;
		}
		availableSeats = seats.length * seats[0].length;
	}
	// A public method that is called to sell tickets to 'num' people
	public static boolean sellTicket(int num) {
		for (int row = 0; row < seats.length; row++) {
			if (sellTicket(num, row)) {
				return true;
			}
		}
		return false;
	}
	// Let's define a private method to see if we can sell tickets for 'num' people from row 'row'
	private static boolean sellTicket(int num, int row) {
		// first check if 'num' seats are available for row 'row'
		if (num <= availableSeatsInRow[row]) {
			int i = 0;
			// skip those seats that are already sold
			while (seats[row][i]) {
				i++;
			}
			// sell 'num' rows from this row
			for (int j = 0; j < num; j++) {
				seats[row][i+j] = true;
				availableSeats --;
				availableSeatsInRow[row] --;
				System.out.printf("Sold seat %d of row %d\n", i+j+1, row+1);
			}
			return true;
		}
		else {
			return false;
		}
	}
	// An accessor to get available seats
	public static int getAvailableSeats() {
		return availableSeats;
	}
	// As we have only one theater and we don't want to allow instantiation for this class, not only should we avoid developing constructors, we must only override the default constructor with private modifer
	private Theater() {};
}
