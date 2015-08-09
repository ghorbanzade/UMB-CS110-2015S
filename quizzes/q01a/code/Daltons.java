//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

public class Daltons {
	public static void main (String[] args) {
		boolean result = false;
		// Check if brothers are from shortest to tallest
		if (args[0].equals("Joe") && args[1].equals("William") && args[2].equals("Jack") && args[3].equals("Averell")) {
			result = true;
		}
		// Check if brothers are from tallest to shortest
		else if (args[0].equals("Averell") && args[1].equals("Jack") && args[2].equals("William") && args[3].equals("Joe")) {
			result = true;
		}
		System.out.println(result);
	}
}