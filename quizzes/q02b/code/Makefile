OBJS = MatrixMultiply.class MatrixMultiplyGeneral.class PrimeCounter.class

all: $(OBJS)
%.class: %.java
	javac -d . -classpath . $<
clean:
	rm -f *.class
