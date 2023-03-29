compile:
	javac NodeType.java
	javac BinarySearchTree.java
	javac BinarySearchTreeDriver.java
run: compile
	java BinarySearchTreeDriver
clean:
	rm NodeType.class
	rm BinarySearchTree.class
	rm BinarySearchTreeDriver.class
