/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.hw05.q01;

public abstract class Aircraft {
	// attributes
	private double flyAltitude;
	private double flySpeed;
	private double altitude;
	private double speed;
	private boolean grounded;
	// methods
	public void takeOff() {
		this.grounded = false;
		this.altitude = this.flyAltitude;
		this.speed = this.flySpeed;
		System.out.println("Plane took off.");
	}
	public void land() {
		this.grounded = true;
		this.altitude = 0;
		this.speed = 0;
		System.out.println("Plane landed.");
	}
	// constructor
	public Aircraft(double altitude, double speed) {
		this.flyAltitude = altitude;
		this.flySpeed = speed;
		this.land();
		System.out.println("New Aircraft Made.");
	}
	// getters and setters
	public boolean isGrounded() {
		return grounded;
	}
	public double getAltitude() {
		return altitude;
	}
	public double getSpeed() {
		return speed;
	}
}
