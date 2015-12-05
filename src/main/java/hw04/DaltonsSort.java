/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.hw04.q01;

import java.util.Scanner;

public class DaltonsSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Let's start with what we know: Names of brothers.
		String[] broNames = {"Joe", "William", "Jack", "Averell"};
		// Now that we can treat these brothers as humans (objects) not just variables,
		// Let's declare an array of objects and put all brothers in it.
		Brother[] bros = new Brother[broNames.length];
		// Now we can give identity to each brother by setting its name
		for (int i = 0; i < bros.length; i++){
			System.out.print("What is the height of " + broNames[i] + "? ");
			int height = input.nextInt();
			bros[i] = new Brother(broNames[i], height);
		}
		// So far, we have four brothers with different names and different heights
		// Let's ask user the sorting order
		System.out.print("In which order do you want to sort the Daltons [ASC, DESC]? ");
		String orderName = input.next();
		boolean orderAsc = orderName.equals("ASC") ? true : false;
		// Now we have all we want. Let's close the Scanner object then.
		input.close();
		// Time for sorting.
		for (int j = 0; j < bros.length; j++) {
			int minIndex = j;
			double min = Double.MAX_VALUE;
			for (int i = j; i < bros.length; i++) {
				if (bros[i].height < min) {
					min = bros[i].height;
					minIndex = i;
				}
			}
			if (j != minIndex) {
				Brother temp = new Brother();
				temp = bros[j];
				bros[j] = bros[minIndex];
				bros[minIndex] = temp;
			}
		}
		// Print names
		for (int i = 0; i < bros.length; i++) {
			System.out.println(orderAsc ? bros[i].getName() : bros[bros.length-1-i].getName());
		}
	}
}
