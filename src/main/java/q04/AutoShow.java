/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.q04.q01;

public class AutoShow {
	public static void main(String[] args) {
		// first instantiate two cars
		Car car1 = new Car(4, 100);
		// for the race car we cannot just move since engine is off
		car1.move(10);
		// we cannot just start engine since no one is in the car yet
		car1.switchEngine();
		// if at least one goes in the car
		car1.board(1);
		// but we still cannot move yet
		car1.move(10);
		// we will then be able to start engine
		car1.switchEngine();;
		// we can then move
		car1.move(10);
		// but if we move for too long, we'll run out of fuel
		car1.move(100);
		// and we cannot move anymore since tank is empty
		car1.move(10);
		// so we have to refuel
		car1.refuel();
		// and then we can move again
		car1.move(100);
		// now we moved 200 miles, but we cannot just get out
		car1.getOff(1);
		// since we should turn the engine off first
		car1.switchEngine();
		// and we can get off now
		car1.getOff(1);
		Car car2 = new Car(2, 150);
		// and the control procedure is just the same
		car2.board(1);
		car2.switchEngine();
		car2.move(150);
		car2.refuel();
		car2.move(50);
		car2.switchEngine();
		car2.getOff(1);
	}
}
