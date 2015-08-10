TARGETS = Daltons2 PrimeMenu ShapeDiamond
CLASSES = ${TARGETS:%=%.class}

all: $(CLASSES)
%.class: %.java
	javac -d . -classpath . $<

clean:
	rm -f *.class
