//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

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
