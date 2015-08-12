//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

public class Pond {
	// Fields
	private static double radius = 100;
	// Instantiation should be forbidden
	private Pond() {}
	// Since radius of pond is fixed, setter for radius is not needed
	public static double getRadius() {
		return radius;
	}
}
