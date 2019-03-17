/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.q03b.q01;

public class EasyMatrix {
	public static int[] arrayInitialize(int matrixSize) {
		int[] array = new int[matrixSize * matrixSize];
		for (int i = 0; i < array.length; i++)
			array[i] = i;
		return array;
	}
	public static void arrayShuffle(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int j = (int) (i + (array.length-i)*Math.random());
			int temp = array[j];
			array[j] = array[i];
			array[i] = temp;
		}
	}
	public static void showMatrix(int[][] matrix) {
		int row = matrix.length;
		int column = matrix[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++)
				System.out.printf("%2d ", matrix[i][j]);
			System.out.println();
		}
	}
	public static int[][] toMatrix(int[] array) {
		int num = (int) Math.sqrt(array.length);
		int[][] matrix = new int[num][num];
		for (int i = 0; i < array.length; i++) {
			matrix[i/num][i%num] = array[i];
		}
		return matrix;
	}
	public static void main(String[] args) {
		int matrixSize = 10;
		int[] array = arrayInitialize(matrixSize);
		// shuffle array
		arrayShuffle(array);
		// convert shuffled array to square matrix
		int[][] matrix = toMatrix(array);
		// show matrix
		showMatrix(matrix);
	}
}
