TARGET_J = BodyMassIndex Cartesian HelloWorld Quadratic
TARGET_C = HelloWorld
CLASS_J = ${TARGET_J:%=%.class}
OBJ_C = ${TARGET_C:%=%.o}

CC=gcc
CFLAGS=-I.
LIBS=-lm

ALL= compilej compilec HelloWorld

all: $(ALL)

compilej: $(CLASS_J)
%.class: %.java
	javac -d . -classpath . $<

compilec: $(OBJ_C)

%.o: %.c
	$(CC) -c -o $@ $< $(CFLAGS)

HelloWorld: HelloWorld.o
	gcc HelloWorld.o -o $@

.PHONY: clean

clean:
	rm -f *.class
	rm -f *.o
	rm -f HelloWorld
