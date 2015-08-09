OBJS = NegativeDiscriminantException.class QuadraticSolver.class

all: $(OBJS)
%.class: %.java
	javac -d . -classpath . $<
clean:
	rm -f *.class
