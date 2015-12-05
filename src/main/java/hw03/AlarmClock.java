/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.hw03.q01;

public class AlarmClock {
	// 1. Data Members
	private int currentTime;
	private int alarmTime;
	private boolean alarmState;
	// 2. Methods
	public void forwardTime(int seconds) {
		//If we insist on making it a real alarm clock
		//try {
		//    Thread.sleep(seconds * 1000);
		//} catch(InterruptedException ex) {
		//    Thread.currentThread().interrupt();
		//}
		this.currentTime += seconds;
		System.out.println("Current Time is "+ this.getCurrentTime());
	}
	public void reset() {
		this.currentTime = 0;
	}
	public void dismiss() {
		setAlarmState(false);
	}
	public void snoozeAlarm(int snoozeTime) {
		setAlarmTime(currentTime + snoozeTime);
	}
	public boolean isRinging() {
		return (this.alarmTime <= this.currentTime && this.getAlarmState()) ? true : false;
	}
	// 3. Getters and Setters
	public int getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}
	public int getAlarmTime() {
		return alarmTime;
	}
	public void setAlarmTime(int alarmTime) {
		this.alarmTime = alarmTime;
	}
	public boolean getAlarmState() {
		return alarmState;
	}
	public void setAlarmState(boolean state) {
		this.alarmState = state;
	}
	// 4. Constructors
	public AlarmClock() {
		currentTime = 0;
		alarmTime = 0;
		alarmState = false;
	}
}
