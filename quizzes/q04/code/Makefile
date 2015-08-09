OBJS = Car.class AutoShow.class

all: $(OBJS)
%.class: %.java
	javac -d . -classpath . $<
clean:
	rm -f *.class
