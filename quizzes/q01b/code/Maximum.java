//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

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