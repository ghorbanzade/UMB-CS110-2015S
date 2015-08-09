OBJS = EasyMatrix.class MyProfile.class UserProfile.class

all: $(OBJS)
%.class: %.java
	javac -d . -classpath . $<
clean:
	rm -f *.class
