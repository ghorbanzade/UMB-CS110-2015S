ASSIGNMENTS = 1 2 3 4 5 6
SOLUTIONS = 1 2 3 4 5 6
FILES = $(foreach NUM, $(ASSIGNMENTS), hw0$(NUM)/assignment/hw0$(NUM))
FILES += $(foreach NUM, $(SOLUTIONS), hw0$(NUM)/solution/hw0$(NUM)s)

CODE_1 = BodyMassIndex Cartesian HelloWorld Quadratic
CODE_2 = Daltons2 PrimeMenu ShapeDiamond
CODE_3 = AlarmClock AlarmClockTest BankAccount MyAccounts DeckCollector DeckShuffle
CODE_4 = Brother DaltonsSort Elevator ElevatorTest Fish Pond Salmon Shark Simulation
CODE_5 = Aircraft ArraySort ArraySortTest Bomber Commercial Dragon Eagle FlightTest sortAndUnsort
CODE_6 = Human Zombie Person Room Simulation
CODES  = $(foreach FILE, $(CODE_1), hw01/code/$(FILE))
CODES += $(foreach FILE, $(CODE_2), hw02/code/$(FILE))
CODES += $(foreach FILE, $(CODE_3), hw03/code/$(FILE))
CODES += $(foreach FILE, $(CODE_4), hw04/code/$(FILE))
CODES += $(foreach FILE, $(CODE_5), hw05/code/$(FILE))
CODES += $(foreach FILE, $(CODE_6), hw06/code/$(FILE))

PDF = $(addsuffix .pdf, $(FILES))
TEX = $(addsuffix .tex, $(FILES))
CLASS = $(addsuffix .class, $(CODES))
JAVA = $(addsuffix .java, $(CODES))

.PHONY: clean code docs all

all: code ;

docs: code $(PDF)
$(PDF): $(TEX)
	@echo -n "  $(@D)... "
	@cd $(@D) && \
	pdflatex $(@F:.pdf=.tex) > /dev/null && \
	pdflatex $(@F:.pdf=.tex) > /dev/null
	@echo "Done."

code: $(CLASS)
$(CLASS): $(JAVA)
	@echo -n "  $(@:.class=)... "
	@cd $(@D) && \
	javac -d . -classpath . $(@F:.class=.java)
	@echo "Done."

clean:
	@find . -name '*.log' -delete
	@find . -name '*.aux' -delete
	@find . -name '*.pdf' -delete
	@find . -name '*.out' -delete
	@find . -name '*.class' -delete
