OBJS = Fridge FridgeTest Patch PatchRevised Phone PowerCalculator Winkophone WinkophoneTest
CLASSES = ${OBJS:%=%.class}

all: $(CLASSES)
%.class: %.java
	javac -d . -classpath . $<
clean:
	rm -f *.class
