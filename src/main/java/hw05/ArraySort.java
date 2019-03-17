/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
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
