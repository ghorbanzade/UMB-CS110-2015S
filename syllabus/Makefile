FILES  = syllabus
PDF   = $(addsuffix .pdf, $(FILES))
TEX   = $(addsuffix .tex, $(FILES))

.PHONY: clean code docs all

all: code ;

docs: code $(PDF)
$(PDF): $(TEX)
	@echo -n "  $(@F)... "
	@cd $(@D) && \
	pdflatex $(@F:.pdf=.tex) > /dev/null && \
	pdflatex $(@F:.pdf=.tex) > /dev/null
	@echo "Done."

code: ;

clean:
	@find . -name '*.log' -delete
	@find . -name '*.aux' -delete
	@find . -name '*.pdf' -delete
	@find . -name '*.out' -delete
