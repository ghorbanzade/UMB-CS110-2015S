/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.hw05.q02;

public class ArraySort implements sortAndUnsort {
	// sorts the array using insertion sort
	// @Override
	public int[] sortInsertion(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			int min = array[i];
			for (int j = i; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}
			if (i != minIndex) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
		return array;
	}
	// shuffles the array
	// @Override
	public int[] shuffle(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int j = (int) (i + (array.length - i)*Math.random());
			int temp = array[j];
			array[j] = array[i];
			array[i] = temp;
		}
		return array;
	}
	// prints the array elements
	// @Override
	public void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%2d ", array[i]);
		}
		System.out.println();
	}
	// initialize array from firstElement to lastElement
	// @Override
	public int[] init(int firstElement, int lastElement) {
		int[] array = new int[lastElement - firstElement + 1];
		for (int i = 0; i < array.length; i++) {
			array[i] = firstElement + i;
		}
		return array;
	}
}
