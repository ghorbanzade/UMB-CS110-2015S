/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.q05.q01;

// @SuppressWarnings("serial")
// As there is no built-in exception to be thrown when discriminant of a polynomial expression is negative we should build our own exception and make sure it extends from class Exceptions
public class NegativeDiscriminantException extends Exception {
	// a simple attribute to show a message to user when exception happens
	private String message;
	// a public constructor to allow instantiation of exceptions
	public NegativeDiscriminantException(String message) {
		this.message = message;
	}
	// a simple getter to override the getMessage() method which comes with class Exception
	public String getMessage() {
		return message;
	}
}
