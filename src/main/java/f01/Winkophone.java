/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.f01.q06;

public class Winkophone extends Phone {
	public Winkophone() {
		super(1000);
	}
	@Override
	public void call(int minutes) {
		int max = Math.max(this.getBattery()-minutes, 0);
		this.setBattery(max);
	}
}
