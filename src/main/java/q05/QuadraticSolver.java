/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.q05.q01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticSolver {
	private static double[] findSolution(double[] coefficients) throws NegativeDiscriminantException, ArithmeticException {
		// compute discriminant (this is safe)
		double discriminant = Math.pow(coefficients[1],2)-(4*coefficients[0]*coefficients[2]);
		// throw Exception when discriminant is negative
		if (discriminant < 0)
			throw new NegativeDiscriminantException("Discriminant is Negative");
		// throw Exception when coefficient a is zero
		else if (coefficients[0] == 0) {
			throw new ArithmeticException("Coefficient 'a' cannot be zero.");
		}
		// If we have only one solution
		else if (discriminant == 0) {
			double[] output = new double[1];
			output[0] = -coefficients[1]/(2*coefficients[0]);
			return output;
		}
		// If we have two solutions
		else {
			double[] output = new double[2];
			output[0] = (-coefficients[1]+Math.sqrt(discriminant))/(2*coefficients[0]);
			output[1] = (-coefficients[1]-Math.sqrt(discriminant))/(2*coefficients[0]);
			return output;
		}
	} // end of findSolution() method
	public static void main(String[] args) {
		// a Scanner object to read user input
		Scanner input = new Scanner(System.in);
		// an array of size three for coefficients
		double[] params = new double[3];
		// an uninitialized array to store solutions given by findSolution method
		double[] solutions;
		// use a while loop to repeat asking for numbers in case required
		while (true) {
			// surround code with try block to handle possible exceptions
			try {
				// ask for three coefficients a, b and c
				for (int i = 0; i < params.length; i++) {
					System.out.printf("Enter Coefficient %d: ",i);
					// ask the user to input double
					// this might throw InputMismatchException
					params[i] = input.nextDouble();
				}
				// find solutions for expression formed based on user input
				// this might throw NegativeDiscriminantException or ArithmeticException
				solutions = findSolution(params);
				// if control flow reaches this part, it means no exception has happened we're good to go out of while loop
				break;
			}
			// Handle InputMismatchException
			catch (InputMismatchException e) {
				// clear previous tokens
				input.next();
				// for InputMismatchException, we cannot use e.getMessage()
				System.out.println("Please enter coefficients of type double");
				System.out.println("Please Retry.\n");
			}
			// Handle Exceptions thrown by method findSolution()
			catch (NegativeDiscriminantException|ArithmeticException e) {
				System.out.println(e.getMessage());
				System.out.println("Please Retry.\n");
			}
		}
		// close the Scanner object
		input.close();
		// print the solutions with three digits of precision
		System.out.println("Solutions are: ");
		for (int i = 0; i < solutions.length; i++)
			System.out.printf("%.3f\n",solutions[i]);
	}
}
