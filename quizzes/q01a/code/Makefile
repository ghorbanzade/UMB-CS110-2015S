OBJS = Daltons.class Dice1.class Dice2.class

all: $(OBJS)
%.class: %.java
	javac -d . -classpath . $<
clean:
	rm -f *.class
