DIRS = 1a 1b 2a 2b 3a 3b 4 5
TARGETS = ${DIRS:%=q0%/code}
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
