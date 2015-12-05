/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.hw05.q02;

public class ArraySortTest {
	public static void main(String[] args) {
		ArraySort instance = new ArraySort();
		// initialize array from 1 to 10
		int[] array = instance.init(1, 10);
		// prints the initialized array
		instance.print(array);
		// shuffles the array
		array = instance.shuffle(array);
		// prints the shuffled array
		instance.print(array);
		// sorts array using insertion sort
		array = instance.sortInsertion(array);
		// prints the sorted array
		instance.print(array);
	}
}
