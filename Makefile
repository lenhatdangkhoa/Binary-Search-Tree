compile:
	javac NodeType.java
	javac BinarySearchTree.java
	javac BinarySearchTreeDriver.java
run: compile
	java BinarySearchTreeDriver test-files/string-input.txt
clean:
	rm NodeType.class
	rm BinarySearchTree.class
	rm BinarySearchTreeDriver.class
