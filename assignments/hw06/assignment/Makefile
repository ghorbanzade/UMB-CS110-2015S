DIRS = hw06
OBJS = ${DIRS:%=%.pdf}

.PHONY: all
all: code

.PHONY: docs
docs: $(OBJS)

$(OBJS): code
%.pdf: %.tex
	pdflatex $<
	pdflatex $<

.PHONY: code
code: ;

.PHONY: clean
clean:
	rm -f *.out *.aux *.log *.pdf
