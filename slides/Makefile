TOP_DIR = ..

SLIDES= 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19
FONT_DIR= ../template/fonts
FILES = $(foreach NUM, $(SLIDES), ls$(NUM)/ls$(NUM))
PDF   = $(addsuffix .pdf, $(FILES))
TEX   = $(addsuffix .tex, $(FILES))

.PHONY: clean code prepare docs all

all: code ;

docs: code prepare $(PDF)
	@echo -n "  Binding documents... "
	@gs -dBATCH -dNOPAUSE -q -sDEVICE=pdfwrite -sOutputFile=$(TOP_DIR)/slides.pdf $(PDF)
	@echo "Done."

$(PDF): $(TEX)
	@echo -n "  $(@D)... "
	@cd $(@D) && \
	xelatex -shell-escape $(@F:.pdf=.tex) > /dev/null && \
	xelatex -shell-escape $(@F:.pdf=.tex) > /dev/null
	@echo "Done."

prepare:
	@rm -rf "$(FONT_DIR)"
	@echo -n "  Extracting fonts..."
	@mkdir -p $(FONT_DIR)
	@tar -zxf $(FONT_DIR).tar.gz -C $(FONT_DIR) --strip-component=1
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
	@rm -f $(BIND_DIR)/slides.pdf
	@rm -rf "$(FONT_DIR)"
