/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
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
