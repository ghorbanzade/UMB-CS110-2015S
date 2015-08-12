//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

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
