/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
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
