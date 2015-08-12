TARGETS = ArraySort ArraySortTest sortAndUnsort \
	Aircraft Bomber Commercial Dragon Eagle FlightTest
CLASSES = ${TARGETS:%=%.class}

all: $(CLASSES)
%.class: %.java
	javac -d . -classpath . $<

clean:
	rm -f *.class
