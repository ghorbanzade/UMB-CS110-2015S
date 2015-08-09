//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <pejman@cs.umb.edu>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

public class PrimeCounter {
	public static void main(String args[]) {
		int i; // first loop (number counter)
		int j; // second loop (prime checker)
		int[] primeList = new int[100000]; // array of primes
		int counter = 0; // counter for array of primes
		boolean definitelyNotPrime; // flag for prime checking
		
		// args[0] is a string. We have to convert it to an integer first.
		int maxNumber = Integer.parseInt(args[0]);
		
		System.out.println("Prime numbers less than " + args[0] + " are: ");
		for (i = 2; i <= maxNumber; i++) {
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
				System.out.printf("Prime %3d: %d\n", counter, i);
			}
		}
	}
}
