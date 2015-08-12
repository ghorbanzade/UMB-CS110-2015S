TARGETS = Brother DaltonsSort Elevator ElevatorTest Fish Pond Salmon Sark Simulation
CLASSES = ${TARGETS:%=%.class}

all: $(CLASSES)
%.class: %.java
	javac -d . -classpath . $<

clean:
	rm -f *.class
