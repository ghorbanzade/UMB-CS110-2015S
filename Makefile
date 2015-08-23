DOCS = syllabus assignments quizzes labs exams slides
PDF = $(addsuffix .pdf, $(FILES))

.PHONY: clean code docs all
all: code

docs: code $(PDF)
	@echo -n "  Binding documents... "
	@gs -dBATCH -dNOPAUSE -q -sDEVICE=pdfwrite -sOutputFile=course-material.pdf $(PDF)
	@echo "Done."
	@rm -f $(PDF)

$(PDF):
	@$(MAKE) --no-print-directory docs -C assignments;
	@$(MAKE) --no-print-directory docs -C quizzes;
	@$(MAKE) --no-print-directory docs -C labs;
	@$(MAKE) --no-print-directory docs -C exams;
	@$(MAKE) --no-print-directory docs -C slides;
	@$(MAKE) --no-print-directory docs -C syllabus;

code:
	@$(MAKE) --no-print-directory code -C assignments;
	@$(MAKE) --no-print-directory code -C quizzes;
	@$(MAKE) --no-print-directory code -C labs;
	@$(MAKE) --no-print-directory code -C exams;
	@$(MAKE) --no-print-directory code -C slides;
	@$(MAKE) --no-print-directory code -C syllabus;

clean:
	@$(MAKE) --no-print-directory clean -C assignments;
	@$(MAKE) --no-print-directory clean -C quizzes;
	@$(MAKE) --no-print-directory clean -C labs;
	@$(MAKE) --no-print-directory clean -C exams;
	@$(MAKE) --no-print-directory clean -C slides;
	@$(MAKE) --no-print-directory clean -C syllabus;
