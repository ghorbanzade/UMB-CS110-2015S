//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

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