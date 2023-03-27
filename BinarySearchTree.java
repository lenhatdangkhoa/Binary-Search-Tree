

public class BinarySearchTree<T extends Comparable<T>> {
    NodeType<T> root;

    public BinarySearchTree() {
        root.info = null;
    }

    public void insert(T key) {
        NodeType<T> placeholder = new NodeType<>(root);
        if (root.info == null) { // adding for empty tree
            root.info = key.info;
        } else if (key.compareTo(root) == 0) { // checking for dupe on root node
            return;
        } else {
            while (key.compareTo(placeholder.info.left) == -1 || key.compareTo(placeholder.info.right) == 1) {
                if (key.compareTo(placeholder.info) == 0) { // checking dupe within tree
                    return;
                }
                if (key.compareTo(placeholder.info.left) == -1 || placeholder.left == null) {
                    if (placeholder.left == null) {
                        placeholder.left.info = key;
                    } // if
                    placeholder = placeholder.left;
                } else if (key.compareTo(placeholder.info.right) == 1 || placeholder.right == null) {
                    if (placeholder.right == null) {
                        placeholder.right.info = key;
                    }
                    placeholder = placeholder.right;
                }
            }
        }
        placeholder = root;
    } // insert
    /*
    public void delete(T key) {} // key

    public boolean search(T item) {
        if (root.info == null) {
            return false;
        }
        while (root.info != null) {
            if (item.compareTo(root.right) == 0 || item.compareTo(root.left) == 0) {
                return true;
            } else if (item.compareTo(root.right) == 1 || item.compareTo(root.left) == -1) {
                search(root);
            } else {
                return false;
            }
        }
        // reset root to top of tree here!
    } // serach
    */

    public void inOrder(){}
}
