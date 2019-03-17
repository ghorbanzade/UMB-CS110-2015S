/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.f01.q03;

import java.util.Scanner;

public class Patch {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num = scnr.nextInt();
		scnr.close();
		int[] matrix = new int[num];
		for (int i = 0; i <= num; i++)
			matrix[i] = i;
		System.out.println(Math.sqrt(matrix[num/2]));
	}
}
