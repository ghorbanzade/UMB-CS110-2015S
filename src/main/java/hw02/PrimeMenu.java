/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.hw02.q03;

import java.util.Scanner;

public class PrimeMenu {
	public static void main(String[] args) {
		int i; // loop counter
		int j; // loop counter
		int[] primeList = new int[100000]; // array of primes
		int counter = 0; // counter for array of primes
		boolean definitelyNotPrime; // flag for prime checking
		Scanner input = new Scanner(System.in);

		System.out.print("What is the number? ");
		// ask Minnie the number
		int number = input.nextInt();
		// close scanner since we don't need it anymore
		input.close();
		// Now find all prime numbers less than or equal to half that number
		System.out.print("Calculating...");
		for (i = 2; i <= number/2; i++) {
			// check if a number is prime
			// a number is prime if is not divisible by any smaller prime number
			// note that we can't afford to check if any smaller number divides our number
			definitelyNotPrime = false;
			for (j = 0; j < counter; j++) {
				if (i % primeList[j] == 0) {
					definitelyNotPrime = true;
				}
			}
			if (!definitelyNotPrime) {
				primeList[counter++] = i;
			}
		}
		System.out.println(" OK.");
		System.out.println("Prime\tNumber");
		// Now we know all prime lists to check for
		for (i = 0; i < counter; i++) {
			j = 0;
			while ( number % primeList[i] == 0) {
				number /= primeList[i];
				j++;
			}
			if (j != 0) {
				System.out.println(primeList[i]+"\t"+j);
			}
		}
	}
}
