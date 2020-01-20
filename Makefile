.PHONY: compile check run

compile:
	mkdir -p target
	javac -d target -sourcepath ./src src/*.java

clean:
	rm -f target/*.class

run:
	java -cp ./target Main

check:
	check
