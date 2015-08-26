TOP_DIR = ..

FILES = syllabus
PDF = $(addsuffix .pdf, $(FILES))
TEX = $(addsuffix .tex, $(FILES))

.PHONY: clean code docs all

all: code ;

docs: code $(PDF)
$(PDF): $(TEX)
	@echo -n "  $(@F)... "
	@cd $(@D) && \
	pdflatex -halt-on-error $(@F:.pdf=.tex) > /dev/null && \
	pdflatex -halt-on-error $(@F:.pdf=.tex) > /dev/null
	@echo "Done."
	@cp $(PDF) $(TOP_DIR)/syllabus.pdf

code: ;

clean:
	@find . -name '*.log' -delete
	@find . -name '*.aux' -delete
	@find . -name '*.pdf' -delete
	@find . -name '*.out' -delete
