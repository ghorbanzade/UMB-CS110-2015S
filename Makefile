TARGETS = labs quizzes assignments exams

TARGETS_CLEAN = $(addsuffix .clean,$(TARGETS))

.PHONY: all
all: $(TARGETS)

.PHONY: $(TARGETS)
$(TARGETS):
	@$(MAKE) --no-print-directory -C $@ all

.PHONY: clean
clean: $(TARGETS_CLEAN)

.PHONY: $(TARGETS_CLEAN)
$(TARGETS_CLEAN):
	@$(MAKE) --no-print-directory -C $(basename $@) clean
