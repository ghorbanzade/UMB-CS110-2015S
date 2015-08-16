SLIDES= 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19
FILES = $(foreach NUM, $(SLIDES), ls$(NUM)/ls$(NUM))
PDF   = $(addsuffix .pdf, $(FILES))
TEX   = $(addsuffix .tex, $(FILES))

.PHONY: clean code docs all

all: code ;

docs: code $(PDF)
$(PDF): $(TEX)
	@echo -n "  $(@D)... "
	@cd $(@D) && \
	xelatex -shell-escape $(@F:.pdf=.tex) > /dev/null && \
	xelatex -shell-escape $(@F:.pdf=.tex) > /dev/null
	@echo "Done."

code: ;

clean:
	@find . -name '*.pdf' -delete
	@find . -name '*.log' -delete
	@find . -name '*.out' -delete
	@find . -name '*.aux' -delete
	@find . -name '*.nav' -delete
	@find . -name '*.pyg' -delete
	@find . -name '*.vrb' -delete
	@find . -name '*.snm' -delete
	@find . -name '*.toc' -delete
