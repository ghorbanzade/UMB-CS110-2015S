/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.q02a.q02;

import java.util.Scanner;

public class MatrixDeterminant {
	public static void main(String[] args) {
		int i; // 1st loop (row)
		int j; // 2nd loop (col)
		int[][] matrix = new int[3][3]; // array of int for 3x3 matrix
		long determinant; // long is bigger than int
		Scanner input = new Scanner(System.in); // we create scanner object
		// ask user to initialize matrix
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.printf("Insert element in row %d and col %d: ",i,j);
				matrix[i][j] = input.nextInt();
			}
		}
		// close Scanner object as we don't need it anymore
		input.close();
		// show initialized matrix to user
		System.out.println("Matrix is: ");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.printf("%5d ",matrix[i][j]);
			}
			System.out.println();
		}
		// show determinant
		System.out.print("Determinant for matrix is: ");
		determinant = matrix[0][0]*matrix[1][1]*matrix[2][2]
				+ matrix[1][0]*matrix[2][1]*matrix[1][2]
				+ matrix[0][1]*matrix[1][2]*matrix[2][0]
				- matrix[0][2]*matrix[1][1]*matrix[2][0]
				- matrix[0][0]*matrix[1][2]*matrix[2][1]
				- matrix[2][2]*matrix[1][0]*matrix[0][1];
		System.out.println(determinant);
	}
}
