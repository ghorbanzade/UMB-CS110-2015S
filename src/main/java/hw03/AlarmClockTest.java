/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.hw03.q01;

import java.util.Scanner;

public class AlarmClockTest {
	public static void main(String[] args) {
		AlarmClock clock = new AlarmClock();
		Scanner input = new Scanner(System.in);
		System.out.print("Please set an alarm: ");
		int alarmTime = input.nextInt();
		clock.setAlarmTime(alarmTime);
		clock.setAlarmState(true);
		while (clock.getAlarmState()) {
			clock.forwardTime(10);
			if (clock.isRinging()) {
				System.out.println("Ringing!");
				System.out.println("What should we do [1-2]?");
				System.out.printf("\t1. Snooze\n");
				System.out.printf("\t2. Dismiss\n");
				int action = input.nextInt();
				switch (action) {
					case 1: clock.snoozeAlarm(300); break;
					case 2: clock.dismiss(); break;
				}
			}
		}
		System.out.println("Good morning!");
		input.close();
	}
}
