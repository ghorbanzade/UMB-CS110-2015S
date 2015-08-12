NUMS = 1 2 3 4 5
DIRS = ${NUMS:%=hw0%}
TARGETS_CODE =
TARGETS_DOCS = ${DIRS:%=%/assignment}
TARGETS = $(TARGETS_CODE) $(TARGETS_DOCS)
TARGETS_CLEAN = $(addsuffix .clean,$(TARGETS))

.PHONY: all
all: code

.PHONY: docs
docs: $(TARGETS_DOCS)

.PHONY: $(TARGETS_DOCS)
$(TARGETS_DOCS): code
	@$(MAKE) --no-print-directory -C $@ docs

.PHONY: code
code: $(TARGETS_CODE)

.PHONY: $(TARGETS_CODE)
$(TARGETS_CODE):
	@$(MAKE) --no-print-directory -C $@ all

.PHONY: clean
clean: $(TARGETS_CLEAN)

.PHONY: $(TARGETS_CLEAN)
$(TARGETS_CLEAN):
	@$(MAKE) --no-print-directory -C $(basename $@) clean
