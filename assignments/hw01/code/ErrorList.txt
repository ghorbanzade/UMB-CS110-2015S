Semicolon is ommited:
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Syntax error, insert ";" to complete BlockStatements
	at HelloJava.main(HelloJava.java:11)

{ for main method omitted:
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Syntax error on token ")", { expected after this token
	at HelloWorld.main(HelloWorld.java:10)

; replaced with { for main method:
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	This method requires a body instead of a semicolon
	at HelloWorld.main(HelloWorld.java:10)

closing brace omitted:
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Syntax error, insert "}" to complete ClassBody
	at HelloWorld.main(HelloWorld.java:13)

both closing braces omitted:
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Syntax error, insert "}" to complete MethodBody
	at HelloWorld.main(HelloWorld.java:11)

closing double-quote omitted:
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	String literal is not properly closed by a double-quote
	at HelloWorld.main(HelloWorld.java:11)

starting double-quote omitted:
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Syntax error on token(s), misplaced construct(s)
	Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration
	Syntax error, insert ";" to complete BlockStatements
	Hello cannot be resolved to a type
	at HelloWorld.main(HelloWorld.java:11)

println is misspelled:
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method printsn(String) is undefined for the type PrintStream
	at HelloWorld.main(HelloWorld.java:11)

HelloWorld class is misspelled:
Error: Could not find or load main class HelloWorld

One of public, static, void, main, String[] or args omitted:
Error: Main method not found in class HelloWorld, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application