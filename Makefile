TOP_DIR = .
BIN_DIR = $(TOP_DIR)/bin
SRC_DIR = $(TOP_DIR)/src
TEX_DIR = $(SRC_DIR)/main/tex
FONT_DIR= $(TEX_DIR)/template/fonts
DOC_DIR = $(BIN_DIR)/documents
SYLLABUS_DIR = $(TEX_DIR)/syllabus
ASSIGNMENTS_DIR = $(TEX_DIR)/assignments
QUIZ_DIR = $(TEX_DIR)/quizzes
LAB_DIR = $(TEX_DIR)/labs
EXAMS_DIR = $(TEX_DIR)/exams
SLIDES_DIR = $(TEX_DIR)/slides

SYLLABUS = syllabus
ASSIGNMENTS = hw01 hw01s hw02 hw02s hw03 hw03s hw04 hw04s hw05 hw05s hw06 hw06s
QUIZ = q01a q01b q02a q02b q03a q03b q04 q05
LAB = l01 l02 l03 l04 l05 l06 l07 l08 l09 l10 l11 l12
EXAMS = m01 m01s f01 f01s f02
SLIDES = ls01 ls02 ls03 ls04 ls05 ls06 ls07 ls08 ls09 ls10 ls11 ls12 ls13 ls14 ls15 ls16 ls17 ls18 ls19

ALL_DOC = $(SYLLABUS) $(ASSIGNMENTS) $(QUIZ) $(LAB) $(EXAMS) $(SLIDES)
ALL_PDF = $(foreach NUM, $(ALL_DOC), $(DOC_DIR)/$(NUM).pdf)

SYLLABUS_TEX = $(foreach NUM, $(SYLLABUS), $(TEX_DIR)/syllabus/$(NUM).tex)
SYLLABUS_PDF = $(foreach NUM, $(SYLLABUS), $(DOC_DIR)/$(NUM).pdf)
ASSIGNMENTS_TEX = $(foreach NUM, $(ASSIGNMENTS), $(TEX_DIR)/assignments/$(NUM).tex)
ASSIGNMENTS_PDF = $(foreach NUM, $(ASSIGNMENTS), $(DOC_DIR)/$(NUM).pdf)
QUIZ_TEX = $(foreach NUM, $(QUIZ), $(QUIZ_DIR)/$(NUM).tex)
QUIZ_PDF = $(foreach NUM, $(QUIZ), $(DOC_DIR)/$(NUM).pdf)
LAB_TEX = $(foreach NUM, $(LAB), $(LAB_DIR)/$(NUM).tex)
LAB_PDF = $(foreach NUM, $(LAB), $(DOC_DIR)/$(NUM).pdf)
EXAMS_TEX = $(foreach NUM, $(EXAMS), $(TEX_DIR)/exams/$(NUM).tex)
EXAMS_PDF = $(foreach NUM, $(EXAMS), $(DOC_DIR)/$(NUM).pdf)
SLIDES_TEX = $(foreach NUM, $(SLIDES), $(TEX_DIR)/slides/$(NUM).tex)
SLIDES_PDF = $(foreach NUM, $(SLIDES), $(DOC_DIR)/$(NUM).pdf)

.PHONY: clean code docs syllabus assignments quizzes labs exams slides bind tidy all

all: code

docs: directories code build

directories:
	@mkdir -p $(BIN_DIR)
	@mkdir -p $(DOC_DIR)

build: syllabus assignments quizzes labs exams slides binder tidy

syllabus: $(SYLLABUS_PDF)

$(SYLLABUS_PDF): $(SYLLABUS_TEX)
	@echo -n "  $(@F)... " && \
	pdflatex -halt-on-error -output-directory $(DOC_DIR) $(SYLLABUS_DIR)/$(@F:.pdf=.tex) > /dev/null && \
	pdflatex -halt-on-error -output-directory $(DOC_DIR) $(SYLLABUS_DIR)/$(@F:.pdf=.tex) > /dev/null
	@echo "Done."

assignments: $(ASSIGNMENTS_PDF)

$(ASSIGNMENTS_PDF): $(ASSIGNMENTS_TEX)
	@echo -n "  $(@F)... " && \
	pdflatex -halt-on-error -output-directory $(DOC_DIR) $(ASSIGNMENTS_DIR)/$(@F:.pdf=.tex) > /dev/null && \
	pdflatex -halt-on-error -output-directory $(DOC_DIR) $(ASSIGNMENTS_DIR)/$(@F:.pdf=.tex) > /dev/null
	@echo "Done."

quizzes: $(QUIZ_PDF)

$(QUIZ_PDF): $(QUIZ_TEX)
	@echo -n "  $(@F)... " && \
	pdflatex -halt-on-error -output-directory $(DOC_DIR) $(QUIZ_DIR)/$(@F:.pdf=.tex) > /dev/null && \
	pdflatex -halt-on-error -output-directory $(DOC_DIR) $(QUIZ_DIR)/$(@F:.pdf=.tex) > /dev/null
	@echo "Done."

labs: $(LAB_PDF)

$(LAB_PDF): $(LAB_TEX)
	@echo -n "  $(@F)... " && \
	pdflatex -halt-on-error -output-directory $(DOC_DIR) $(LAB_DIR)/$(@F:.pdf=.tex) > /dev/null && \
	pdflatex -halt-on-error -output-directory $(DOC_DIR) $(LAB_DIR)/$(@F:.pdf=.tex) > /dev/null
	@echo "Done."

exams: $(EXAMS_PDF)

$(EXAMS_PDF): $(EXAMS_TEX)
	@echo -n "  $(@F)... " && \
	pdflatex -halt-on-error -output-directory $(DOC_DIR) $(EXAMS_DIR)/$(@F:.pdf=.tex) > /dev/null && \
	pdflatex -halt-on-error -output-directory $(DOC_DIR) $(EXAMS_DIR)/$(@F:.pdf=.tex) > /dev/null
	@echo "Done."

slides: prepare $(SLIDES_PDF)

prepare:
	@rm -rf "$(FONT_DIR)"
	@echo -n "  Extracting fonts... "
	@mkdir -p $(FONT_DIR)
	@tar -zxf $(FONT_DIR).tar.gz -C $(FONT_DIR) --strip-component=1
	@echo "Done."

$(SLIDES_PDF): $(SLIDES_TEX)
	@echo -n "  $(@F)... "
	@cd $(DOC_DIR) && \
	xelatex -halt-on-error -shell-escape ../../$(SLIDES_DIR)/$(@F:.pdf=.tex) > /dev/null && \
	xelatex -halt-on-error -shell-escape ../../$(SLIDES_DIR)/$(@F:.pdf=.tex) > /dev/null
	@echo "Done."

binder:
	@echo -n "  Binding documents... "
	@gs -dBATCH -dNOPAUSE -q -sDEVICE=pdfwrite -sOutputFile=$(BIN_DIR)/course-material.pdf $(ALL_PDF)
	@echo "Done."

code:
	@ant;

tidy:
	@rm -rf $(FONT_DIR)
	@find $(BIN_DIR) -name '*.log' -delete
	@find $(BIN_DIR) -name '*.aux' -delete
	@find $(BIN_DIR) -name '*.out' -delete
	@find $(BIN_DIR) -name '*.vrb' -delete
	@find $(BIN_DIR) -name '*.snm' -delete
	@find $(BIN_DIR) -name '*.toc' -delete
	@find $(BIN_DIR) -name '*.nav' -delete
	@find $(BIN_DIR) -name '*.pyg' -delete

clean:
	@ant clean
	@rm -rf $(BIN_DIR)
