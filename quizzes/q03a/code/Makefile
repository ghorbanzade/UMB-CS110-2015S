OBJS = Theater.class TicketSale.class

all: $(OBJS)
%.class: %.java
	javac -d . -classpath . $<
clean:
	rm -f *.class
