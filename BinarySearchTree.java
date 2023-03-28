

public class BinarySearchTree<T extends Comparable<T>> {
    NodeType<T> root;
    NodeType<T> currentPos;
    boolean checker;
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
    */

    public boolean search(T item) {
    if (root.info == null) {
        return checker = false;
    }
    if (item.compareTo(currentPos.info) > 0) {
        currentPos = currentPos.right;
        if (currentPos == null) {
            currentPos = root;
            return checker = false;
        } else {
        search(item);
        }
    } if (item.compareTo(currentPos.info) < 0) {
        currentPos = currentPos.left;
        if (currentPos == null) {
            currentPos = root;
            return checker = false;
        } else {
        search(item);
        }
    } if (item.compareTo(currentPos.info) == 0) {
        currentPos = root;
        return checker = true;
    }
    System.out.println(checker); // helps visualize the output
    return checker;
} // reset root to top of tree here!

    public void inOrder(NodeType<T> root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.info + " ");
        inOrder(root.right);
    } // inOrder

}
