/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.q01b.q02;

public class Maximum {
	public static void main (String[] args) {
		// Converting command-line arguments to integer numbers
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		// Maximum number
		// We used conditional ternary operations to make our code more concise, elegant and easy to read
		// The following conditional ternary operation is equivalent to
		// if (num1 > num2) { max = num1; } else {	max = num2; }
		int max = (num1 > num2) ? num1 : num2;
		max = (max > num3) ? max : num3;
		System.out.println("Maximum number is " + max);
		// Minimum number
		int min = (num1 > num2) ? num2 : num1;
		min = (min > num3) ? num3 : min;
		System.out.println("Minimum numer is " + min);
		// Mean Value
		double mean = (num1 + num2 + num3)/3;
		System.out.printf("Mean value is %.2f\n", mean);
	}
}
