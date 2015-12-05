/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.hw04.q03;

public class Fish {
	// fields
	private static int numFish = 0;
	// attributes
	private double posRho;
	private double posAng;
	private double speed;
	// methods
	public void move() {
		double oldX = posRho * Math.cos(posAng);
		double oldY = posRho * Math.sin(posAng);
		while (true) {
			double theta = Math.random() * 2 * Math.PI;
			double newX = oldX + speed*Math.cos(theta);
			double newY = oldY + speed*Math.sin(theta);
			double newRho = Math.sqrt(Math.pow(newX,2) + Math.pow(newY,2));
			if (newRho < Pond.getRadius()) {
				posRho = newRho;
				posAng = Math.atan2(newY, newX);
				break;
			}
		}
	}
	// constructor
	public Fish() {
		posRho = Math.random() * Pond.getRadius();
		posAng = Math.random() * 2 * Math.PI;
		numFish++;
	}
	public Fish(double[] position) {
		posRho = Math.sqrt(Math.pow(position[0], 2) + Math.pow(position[1], 2));
		posAng = Math.atan2(position[1], position[0]);
		numFish++;
	}
	// getter and setter for position
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public static int getNumFish() {
		return numFish;
	}
	public double[] getPosition() {
		double[] position = new double[2];
		position[0] = posRho * Math.cos(posAng);
		position[1] = posRho * Math.sin(posAng);
		return position;
	}
}
