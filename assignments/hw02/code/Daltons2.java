//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

import java.util.Scanner;

public class Daltons2 {
	public static void main(String[] args) {
		int i; // loop counter
		int j; // loop counter
		// sorting order: true for ASC, false for DESC
		boolean orderAsc;
		// String array for names of Dalton Brothers
		String[] names = {"Joe", "William", "Jack", "Averell"};
		// Double array for heights of Dalton brothers
		// length of heights[] is determined by number of brothers
		double[] heights = new double[names.length];
		// declaring a Scanner object to get inputs from user
		Scanner input = new Scanner(System.in);
		
		// Getting height of each brother
		for (i = 0; i < names.length; i++) {
			System.out.print("What is the height of "+names[i]+"? ");
			heights[i] = input.nextDouble();
		}
		// Get order from user
		// a while(true) loop is used to ensure user inserts desired input
		// (This is not the best method to solve this problem, as will be discussed later in class)
		while (true) {
			System.out.print("In which order do you want to sort the Daltons [ASC, DESC]? ");
			// Get a String from user
			String orderName = input.next();
			// check if value of given String matches 'ASC'
			if (orderName.equals("ASC")) {
				orderAsc = true;
				// end while(true) loop
				break; 
			}
			// check if value of given String matches 'DESC'
			else if (orderName.equals("DESC")) {
				orderAsc = false;
				// end while(true) loop
				break;
			}
			// if value of String is neither 'ASC' nor 'DESC'
			// prompt user that his input is unacceptable
			// note that the while(true) loop continues after this condition
			else {
				System.out.println("Invalid input.");
			}
		}
		// Close Scanner object as we don't need it anymore
		input.close();
		// if we wanted to show heights we could do it in one line: Arrays.sort(heights)
		// since we are asked to show names sorted based on heights
		// we'll find indices of the sorted heights array.
		double min;
		int[] indices = new int[heights.length];
		boolean[] counted = new boolean[heights.length];
		for (i = 0; i < heights.length; i++) 
			counted[i] = false;
		for (i = 0; i < heights.length; i++) {
			min = Double.MAX_VALUE;
			for (j = 0; j < heights.length; j++) {
				if (!counted[j] && heights[j] <= min) {
					min = heights[j];
					indices[i] = j; 
				}
			}
			counted[indices[i]] = true;
		}
		// now indices are found, show names based on indices
		for (i = 0; i < heights.length; i++) {
			System.out.println(orderAsc ? names[indices[i]] : names[indices[3-i]]);
		}
	}
}