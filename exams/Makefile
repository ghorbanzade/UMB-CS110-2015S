ASSIGNMENTS = m01 f01 f02
SOLUTIONS = m01 f01
FILES = $(foreach NUM, $(ASSIGNMENTS), $(NUM)/assignment/$(NUM))
FILES += $(foreach NUM, $(SOLUTIONS), $(NUM)/solution/$(NUM)s)

CODE_1 = Fridge FridgeTest Patch PatchRevised Phone PowerCalculator Winkophone WinkophoneTest
CODES  = $(foreach FILE, $(CODE_1), f01/code/$(FILE))

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
