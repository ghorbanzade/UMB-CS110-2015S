OBJS = Maximum.class WindChill.class

all: $(OBJS)
%.class: %.java
	javac -d . -classpath . $<
clean:
	rm -f *.class
