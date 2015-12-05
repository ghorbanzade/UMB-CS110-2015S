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

public class MatrixMultiplyGeneral {
	public static void main(String[] args) {
		// Declaration of Variables
		int i; // counter
		int j; // counter
		int p; // counter
		int q; // counter
		int k;
		int row; // row of matrix
		int col; // column of matrix
		String str = "";
		double matrix1[][];
		double matrix2[][];
		double multiplied[][];
		int matrixSizes[][] = new int[2][2]; // contains number of rows and columns of matrix1 and matrix2
		Scanner input = new Scanner(System.in);
		// ask for dimensions of two matrices
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				switch (j) {
					case 0: str = "row"; break;
					case 1: str = "column"; break;
				}
				System.out.print("Enter number of "+ str +"s of matrix "+ (i+1) + ": " );
				matrixSizes[i][j] = input.nextInt();
			}
		}
		// initialize matrices according to their number of rows and columns
		matrix1 = new double[matrixSizes[0][0]][matrixSizes[0][1]];
		matrix2 = new double[matrixSizes[1][0]][matrixSizes[1][1]];
		multiplied = new double[matrixSizes[0][0]][matrixSizes[1][1]];
		// ask for matrices
		for ( i = 0; i < 2; i++) {
			for ( j = 0; j < matrixSizes[i][0]*matrixSizes[i][1]; j++) {
				row = j / matrixSizes[i][0];
				col = j % matrixSizes[i][1];
				if (i == 0) {
					System.out.println("Enter matrix1[" + row + "][" + col + "]");
					matrix1[row][col] = input.nextInt();
				}
				else {
					System.out.println("Enter matrix2[" + row + "][" + col + "]");
					matrix2[row][col] = input.nextInt();
				}
			}
			System.out.println("Thank you. Matrix initialized as follows:");
			for ( p = 0; p < matrixSizes[i][0]; p++) {
				for ( q = 0; q < matrixSizes[i][1]; q++) {
					System.out.printf("%.1f ",matrix1[p][q]);
				}
				System.out.println("");
			}
		}
		// Scanner input shall be closed
		input.close();
		// check if number of columns of first matrix matches number of rows of second matrix
		if (matrix1[0].length == matrix2.length) {
			for ( i = 0; i < matrix2[0].length; i++) {
				for ( j = 0; j < matrix1.length; j++) {
					for ( k = 0; k < matrix1[0].length; k++) {
						multiplied[i][j] += matrix1[i][k] * matrix2[k][j];
					}
				}
			}
		}
		else {
			System.out.println("Matrices Dimensions Mismatch.");
		}
		// Multiply Matrices
		System.out.println("Answer is: ");
		for ( p = 0; p < matrixSizes[0][0]; p++) {
			for ( q = 0; q < matrixSizes[1][1]; q++) {
				System.out.printf("%.1f ",multiplied[p][q]);
			}
			System.out.println("");
		}
	}
}
