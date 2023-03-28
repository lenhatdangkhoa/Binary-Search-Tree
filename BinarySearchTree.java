

public class BinarySearchTree<T extends Comparable<T>> {
    NodeType<T> root;
    NodeType<T> currentPos;
    public BinarySearchTree() {
        root = new NodeType<T>();
        currentPos = root;
    }

    public void insert(T key) {
        if (key.compareTo(currentPos.info) >= 1) {
            if (currentPos.right == null) {
                currentPos.right = new NodeType<T>();
                currentPos.right.info = key;
                currentPos = root;
            } else {
                currentPos = currentPos.right;
                insert(key);
            }
        } else if (key.compareTo(currentPos.info) <= -1) {
            if (currentPos.left == null) {
                currentPos.left = new NodeType<T>();
                currentPos.left.info = key;
                currentPos = root;
            } else {
                currentPos = currentPos.left;
                insert(key);
            }
        } // else
        return;
    }

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

    public void inOrder(NodeType<T> root){
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.info + " ");
        inOrder(root.right);
    } // inOrder

}
