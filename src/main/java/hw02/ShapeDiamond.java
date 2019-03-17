/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.hw02.q01;

import java.util.Scanner;

public class ShapeDiamond {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// ask user for row number
		System.out.print("Enter number of rows: ");
		int numRows = input.nextInt();
		// close the Scanner as we no longer need it
		input.close();
		int i; // outer loop counter
		int j; // inner loop counter
		for (i=1 ; i <= 2*numRows-1; i++) {
			if (i <= numRows) {
				for (j = numRows; j > i; j--)
					System.out.print(" ");
				for (j = 0; j < 2*i-1; j++)
					System.out.print("*");
				System.out.println("");
			}
			else {
				for (j = 0; j < i-numRows; j++)
					System.out.print(" ");
				for (j = 0; j < 2*(2*numRows-i)-1 ; j++)
					System.out.print("*");
				System.out.println("");
			}
		}
	}
}
