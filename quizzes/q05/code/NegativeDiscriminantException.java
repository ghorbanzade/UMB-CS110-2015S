// package quadratic;
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
