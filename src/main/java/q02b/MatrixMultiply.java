/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.q02b.q02;

import java.util.Scanner;

public class MatrixMultiply {
	public static void main(String[] args) {
		// Declaration of Variables
		int i; // counter
		int j; // counter
		int p; // counter
		int q; // counter
		int k;
		int row; // row of matrix
		int col; // column of matrix
		double matrix1[][] = new double[3][3];
		double matrix2[][] = new double[3][3];
		double multiplied[][] = new double[3][3];
		Scanner input = new Scanner(System.in);
		// ask for matrices
		for ( i = 0; i < 2; i++) {
			for ( j = 0; j < 9; j++) {
				row = j / 3;
				col = j % 3;
				if (i == 0) {
					System.out.print("Enter matrix1[" + row + "][" + col + "]: ");
					matrix1[row][col] = input.nextInt();
				}
				else {
					System.out.print("Enter matrix2[" + row + "][" + col + "]: ");
					matrix2[row][col] = input.nextInt();
				}
			}
			System.out.println("Thank you. Matrix initialized as follows:");
			for ( p = 0; p < 3; p++) {
				for ( q = 0; q < 3; q++) {
					System.out.printf("%.1f ",matrix1[p][q]);
				}
				System.out.println("");
			}
			System.out.println("");
		}
		// Scanner input shall be closed
		input.close();
		for ( i = 0; i < 3; i++) {
			for ( j = 0; j < 3; j++) {
				for ( k = 0; k < 3; k++) {
					multiplied[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		// Multiply Matrices
		System.out.println("Answer is: ");
		for ( p = 0; p < 3; p++) {
			for ( q = 0; q < 3; q++) {
				System.out.printf("%.1f ",multiplied[p][q]);
			}
			System.out.println("");
		}
	}// end of main method
}// end of class MatrixMultiply
