/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.q01b.q01;

public class WindChill {
	public static void main (String[] args) {
		// Given command-line arguments are of String nature.
		// So we have to convert them to double type to perform our calculations.
		// Remember that first argument is args[0].
		double tempCelsius = Double.parseDouble(args[0]);
		double windVelocity = Double.parseDouble(args[1]);
		// Converting Temperature from Celsius to Fahrenheit
		double tempFahrenheit = 1.8 * tempCelsius + 32;
		// Calculating The Wind Chill In Fahrenheits
		double windChillFahrenheit = 35.74 + 0.6215*tempFahrenheit + (0.4275*tempFahrenheit - 5.75)*Math.pow(windVelocity,0.16);
		// Converting Wind Chill from Fahrenheit to Celsius
		double windChillCelsius = 9/5*(windChillFahrenheit - 32);
		int windChill = (int) Math.round(windChillCelsius);
		System.out.print("When temperature is " + tempCelsius + " Celsius and wind is " + windVelocity + " Miles per hour, ");
		System.out.println("Wind chill is " + windChill + " degrees Fahrenheit.");
	}
}
