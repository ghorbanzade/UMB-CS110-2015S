DIRS = assignments

.PHONY: clean code docs all
all: code

docs: code
	$(foreach DIR, $(DIRS), @$(MAKE) --no-print-directory -C $(DIR) $@;)

code:
	$(foreach DIR, $(DIRS), @$(MAKE) --no-print-directory -C $(DIR) $@;)

clean:
	$(foreach DIR, $(DIRS), @$(MAKE) --no-print-directory -C $(DIR) $@;)
