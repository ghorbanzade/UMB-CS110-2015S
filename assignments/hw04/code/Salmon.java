//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

public class Salmon extends Fish {
	private static int numSalmons = 0;
	public Salmon() {
		super();
		setSpeed(10);
		numSalmons++;
	}
	public Salmon(double[] position) {
		super(position);
		setSpeed(10);
		numSalmons++;
	}
	public static int getNumSalmons() {
		return numSalmons;
	}
}
