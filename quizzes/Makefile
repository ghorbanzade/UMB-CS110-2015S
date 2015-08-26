TOP_DIR = ..

ASSIGNMENTS = 01a 01b 02a 02b 03a 03b 04 05
SOLUTIONS = 01a 01b 02a 02b 03a 03b 04 05
FILES = $(foreach NUM, $(ASSIGNMENTS), q$(NUM)/assignment/q$(NUM))
FILES += $(foreach NUM, $(SOLUTIONS), q$(NUM)/solution/q$(NUM)s)

CODE_1a = Daltons Dice1 Dice2
CODE_1b = Maximum WindChill
CODE_2a = MatrixDeterminant PrimeRelative
CODE_2b = MatrixMultiply MatrixMultiplyGeneral PrimeCounter
CODE_3a = Theater TicketSale
CODE_3b = EasyMatrix MyProfile UserProfile
CODE_4 = Car AutoShow
CODE_5 = NegativeDiscriminantException QuadraticSolver
CODES  = $(foreach FILE, $(CODE_1a), q01a/code/$(FILE))
CODES += $(foreach FILE, $(CODE_1b), q01b/code/$(FILE))
CODES += $(foreach FILE, $(CODE_2a), q02a/code/$(FILE))
CODES += $(foreach FILE, $(CODE_2b), q02b/code/$(FILE))
CODES += $(foreach FILE, $(CODE_3a), q03a/code/$(FILE))
CODES += $(foreach FILE, $(CODE_3b), q03b/code/$(FILE))
CODES += $(foreach FILE, $(CODE_4), q04/code/$(FILE))
CODES += $(foreach FILE, $(CODE_5), q05/code/$(FILE))

PDF = $(addsuffix .pdf, $(FILES))
TEX = $(addsuffix .tex, $(FILES))
CLASS = $(addsuffix .class, $(CODES))
JAVA = $(addsuffix .java, $(CODES))

.PHONY: clean code docs all

all: code ;

docs: code $(PDF)
	@echo -n "  Binding documents... "
	@gs -dBATCH -dNOPAUSE -q -sDEVICE=pdfwrite -sOutputFile=$(TOP_DIR)/quizzes.pdf $(PDF)
	@echo "Done."

$(PDF): $(TEX)
	@echo -n "  $(@D)... "
	@cd $(@D) && \
	pdflatex -halt-on-error $(@F:.pdf=.tex) > /dev/null && \
	pdflatex -halt-on-error $(@F:.pdf=.tex) > /dev/null
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
	@rm -f $(BIND_DIR)/quizzes.pdf
