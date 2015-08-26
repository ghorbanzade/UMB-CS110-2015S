TOP_DIR = ..

LABS  = 01 02 03 04 05 06 07 08 09 10 11 12
FILES = $(foreach NUM, $(LABS), l$(NUM)/l$(NUM))
PDF   = $(addsuffix .pdf, $(FILES))
TEX   = $(addsuffix .tex, $(FILES))

.PHONY: clean code docs all

all: code ;

docs: code $(PDF)
	@echo -n "  Binding documents... "
	@gs -dBATCH -dNOPAUSE -q -sDEVICE=pdfwrite -sOutputFile=$(TOP_DIR)/labs.pdf $(PDF)
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
	@rm -f $(BIND_DIR)/labs.pdf
