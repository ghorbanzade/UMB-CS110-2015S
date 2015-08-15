NUMBERS = 1 2 3 4 5 6
FILES = $(foreach NUM, $(NUMBERS), hw0$(NUM)/assignment/hw0$(NUM))
PDF = $(addsuffix .pdf, $(FILES))
TEX = $(addsuffix .tex, $(FILES))

.PHONY: clean $(PDF) all

all: $(PDF)
$(PDF): $(TEX)
	@echo -n "$(@D)... "
	@cd $(@D) && \
	pdflatex $(@F:.pdf=.tex) > /dev/null && \
	pdflatex $(@F:.pdf=.tex) > /dev/null
	@echo "Done."

clean:
	@find . -name '*.log' -delete
	@find . -name '*.aux' -delete
	@find . -name '*.pdf' -delete
	@find . -name '*.out' -delete
