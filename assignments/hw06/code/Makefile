TARGETS = Human Person Room Simulation Zombie
CLASSES = ${TARGETS:%=%.class}

all: $(CLASSES)
%.class: %.java
	javac -d . -classpath . $<

clean:
	rm -f *.class
