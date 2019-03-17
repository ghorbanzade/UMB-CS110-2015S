/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.hw04.q02;

public class ElevatorTest {
	public static void main(String[] args) {
		//outputs current floor
		Elevator.currentLevel();
		//moves the elevator two floors up
		Elevator.go(2);
		Elevator.currentLevel();
	}
}
