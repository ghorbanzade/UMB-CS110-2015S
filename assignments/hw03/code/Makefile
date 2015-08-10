TARGETS = AlarmClock AlarmClockTest BankAccount MyAccounts DeckCollector DeckShuffle
CLASSES = ${TARGETS:%=%.class}

all: $(CLASSES)
%.class: %.java
	javac -d . -classpath . $<

clean:
	rm -f *.class
