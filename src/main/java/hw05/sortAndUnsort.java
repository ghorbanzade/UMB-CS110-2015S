/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.hw05.q02;

public interface sortAndUnsort {
	// sorts the array using insertion sort
	public int[] sortInsertion(int[] array);
	// shuffles the array
	public int[] shuffle(int[] array);
	// prints the array elements
	public void print(int[] array);
	// initialize array from firstElement to lastElement
	public int[] init(int firstElement, int lastElement);
}
