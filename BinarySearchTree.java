

public class BinarySearchTree {
    NodeType<T> root;

    public BinarySearchTree() {
        root.info = null;  
    }

    public void insert(T key) {
        NodeType<T> placeholder = new NodeType<>(root);
        if (root.info == null) { // adding for empty tree
            root.info == key.info;
        } else if (key.compareTo(root) == 0) { // checking for dupe on root node
            return;
        } else {
            while (key.compareTo(placeholder.info.left) || key.compareTo(placeholder.info.right) == (1 || -1) {
                if (key.compareTo(placeholder.info) == 0) {
                    return;
                }
                if (key.compareTo(placeholder.info.left) == -1 || placeholder.left == null) {
                    if (placeholder.left == null) {
                        placeholder.left.info = key;
                    } // if
                    placeholder = placeholder.left;
                } else if (key.compareTo(placeholder.info.right) == 1 || placeholder.right == null) {
                    if (placeholder.right == null) {
                        placeholder.right,info = key;
                    }
                    placeholder = placeholder.right;
                }
            }
        }
    }
}