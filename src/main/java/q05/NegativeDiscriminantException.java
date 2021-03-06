/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
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
