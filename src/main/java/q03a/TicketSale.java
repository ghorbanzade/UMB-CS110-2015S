/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.q03a.q01;

import java.util.Scanner;

public class TicketSale {
	public static void main(String[] args) {
		// First empty the theater
		Theater.initialize();
		Scanner input = new Scanner(System.in);
		// Execute loop until all seats are sold
		while (Theater.getAvailableSeats() > 0) {
			System.out.println(Theater.getAvailableSeats()+" seats still available.");
			System.out.print("Number of tickets to print? ");
			int num = input.nextInt();
			// Call Theater.sellTicket(num) method which returns true if tickets can be sold for the group and returns false if not
			System.out.println(Theater.sellTicket(num) ? "" : "Tickets not available for group of "+num+".\n");
		}
		System.out.println("All seats sold out!");
		input.close();
	}
}
