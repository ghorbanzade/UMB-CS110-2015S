TOP_DIR = ..

ASSIGNMENTS = 01a 01b 02a 02b 03a 03b 04 05
SOLUTIONS = 01a 01b 02a 02b 03a 03b 04 05
FILES = $(foreach NUM, $(ASSIGNMENTS), q$(NUM)/assignment/q$(NUM))
FILES += $(foreach NUM, $(SOLUTIONS), q$(NUM)/solution/q$(NUM)s)

PDF = $(addsuffix .pdf, $(FILES))
TEX = $(addsuffix .tex, $(FILES))

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

code: ;

clean:
	@find . -name '*.log' -delete
	@find . -name '*.aux' -delete
	@find . -name '*.pdf' -delete
	@find . -name '*.out' -delete
	@rm -f $(BIND_DIR)/quizzes.pdf
