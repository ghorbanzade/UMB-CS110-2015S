//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

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
