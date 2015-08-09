// package car;

public class Car {
	// Attributes
	private int maxSeat;
	private int numSeated;
	private boolean engineOn;
	private double tankCapacity; // per mile
	private double tank; // per mile
	// Constructor
	public Car(int maxSeat, double tankCapacity) {
		this.maxSeat = maxSeat;
		this.tankCapacity = tankCapacity;
		engineOn = false;
		numSeated = 0;
		tank = tankCapacity;
	}
	// Methods
	public void refuel() {
		this.tank = tankCapacity;
		System.out.println("Tank refilled!");
	}
	public void switchEngine() {
		if (numSeated > 0) {
			this.engineOn = !engineOn;
			System.out.println("Engine turned "+((engineOn)?"on":"off")+".");
		}
		else {
			System.out.println("No one in the car to switch engine!");
		}
	}
	public void move(double miles) {
		if (engineOn) {
			if (tank == 0) {
				System.out.println("Tank empty!");
			}
			else {
				double distance = Math.min(this.tank, miles);
				this.tank -= distance;
				System.out.printf("Moved %.2f miles!\n", distance);
			}
		}
		else {
			System.out.printf("Engine off!\n");
		}
	}
	public void board(int num) {
		if (!engineOn) {
			if (numSeated + num <= maxSeat) {
				numSeated += num;
				System.out.println(numSeated + " people on board!");
			}
			else {
				System.out.printf("Cannot exceed max seating capacity!\n");
			}
		}
		else {
			System.out.println("Engine must be off before we can board!\n");
		}
	}
	public void getOff(int num) {
		if (!engineOn) {
			if (num <= numSeated) {
				numSeated -= num;
				System.out.println(num + " people got off the car.");
			}
			else {
				System.out.printf("There are only %d people in the car!\n", numSeated);
			}
		}
		else {
			System.out.println("Engine must be off before we can get off!");
		}
	}
	// Getters and Setters
	public boolean isEngineOn() {
		return engineOn;
	}
	public int getNumSeated() {
		return numSeated;
	}
	public double getFuel() {
		return tank;
	}
}
