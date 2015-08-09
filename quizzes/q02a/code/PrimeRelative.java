//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <pejman@cs.umb.edu>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

import java.util.Scanner; // we use scanner to ask for number N

public class PrimeRelative {
	public static void main(String[] args) 
	{
		int i; // 1st for loop (matrix row)
		int j; // 2nd for loop (matrix col)
		int k; // 3rd for loop (division checker)
		int numberN;
		boolean notPrimeRelative;
		
		System.out.print("Please insert the number N: ");
		Scanner input = new Scanner(System.in);
		numberN = input.nextInt();
		System.out.println("Your entered number is " + numberN + ".");
		input.close(); // remember to close the scanner object
		
		numberN++; // to compensate our sacrifice of first row and column
		for (i = 0 ; i < numberN ; i++) {
			for (j = 0 ; j < numberN ; j++) {
				// if first row, print number of columns
				if (i == 0) {
					System.out.printf("%-2d ",j);
				}
				// else if first column, print number of rows
				else if (j == 0) {
					System.out.printf("%-2d ",i);
				}
				// for matrix elements
				else {
					// we initially assume gcd(i,j)=1
					notPrimeRelative = false;
					// now we check if a number k can be found
					// that divides both i and j
					for (k = 2; k <= Math.min(i, j); k++) {
						// if it divides both i and j
						// gcd(i,j) != 1 for sure
						if (i % k == 0 && j % k == 0) {
							// so they are not prime relative
							notPrimeRelative = true;
						}
					}
					if (notPrimeRelative) {
						System.out.print("   ");
					}
					else {
						System.out.print("*  ");
					}					
				}
			}
			// after each row, a feed line is inserted
			System.out.println();
		}
	}
}
