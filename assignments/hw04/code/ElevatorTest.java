//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

public class ElevatorTest {
	public static void main(String[] args) {
		//outputs current floor
		Elevator.currentLevel();
		//moves the elevator two floors up
		Elevator.go(2);
		Elevator.currentLevel();
	}
}
