TOP_DIR = ..

ASSIGNMENTS = 1 2 3 4 5 6
SOLUTIONS = 1 2 3 4 5 6
FILES = $(foreach NUM, $(ASSIGNMENTS), hw0$(NUM)/assignment/hw0$(NUM))
FILES += $(foreach NUM, $(SOLUTIONS), hw0$(NUM)/solution/hw0$(NUM)s)

PDF = $(addsuffix .pdf, $(FILES))
TEX = $(addsuffix .tex, $(FILES))

.PHONY: clean code docs all

all: code ;

docs: code $(PDF)
	@echo -n "  Binding documents... "
	@gs -dBATCH -dNOPAUSE -q -sDEVICE=pdfwrite -sOutputFile=$(TOP_DIR)/assignments.pdf $(PDF)
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
	@rm -f $(BIND_DIR)/exams.pdf
