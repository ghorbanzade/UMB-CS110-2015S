.PHONY: clean code docs all
all: code

docs: code
	@$(MAKE) --no-print-directory docs -C assignments docs;
	@$(MAKE) --no-print-directory docs -C quizzes docs;
	@$(MAKE) --no-print-directory docs -C labs docs;
	@$(MAKE) --no-print-directory docs -C exams docs;
	@$(MAKE) --no-print-directory docs -C slides docs;

code:
	@$(MAKE) --no-print-directory code -C assignments code;
	@$(MAKE) --no-print-directory code -C quizzes code;
	@$(MAKE) --no-print-directory code -C labs code;
	@$(MAKE) --no-print-directory code -C exams code;
	@$(MAKE) --no-print-directory code -C slides code;

clean:
	@$(MAKE) --no-print-directory clean -C assignments;
	@$(MAKE) --no-print-directory clean -C quizzes;
	@$(MAKE) --no-print-directory clean -C labs;
	@$(MAKE) --no-print-directory clean -C exams;
	@$(MAKE) --no-print-directory clean -C slides;
