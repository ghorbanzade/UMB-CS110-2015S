DIRS = hw05s
OBJS = ${DIRS:%=%.pdf}

all: $(OBJS)
%.pdf: %.tex
	pdflatex $<
	pdflatex $<
clean:
	rm -f *.out *.aux *.log *.pdf
