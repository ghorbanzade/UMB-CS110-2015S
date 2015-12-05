/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
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
