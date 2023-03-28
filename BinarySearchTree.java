public class BinarySearchTree<T extends Comparable<T>> {
    NodeType<T> root;
    boolean checker;
    public BinarySearchTree() {
        root = new NodeType<T>();
    }

    /**
     * Insert the key at the correct position in the tree.
     */
    public void insert(T key) {
        root = findPosition(root, key);
    }

    /**
     * A helper function for insert. Find the correct position to insert the key.
     * @param root the root
     * @param key the key
     * @return root
     */
    private NodeType<T> findPosition(NodeType<T> root, T key) {
        if (root == null) {
            root = new NodeType<T>();
            root.info = key;
            return root;
        }
        if (key.compareTo(root.info) <= -1) root.left = findPosition(root.left, key);
        if (key.compareTo(root.info) >= 1) root.right = findPosition(root.right, key);
        return root;
    } //findPosition
    /*
    public void delete(T key) {} // key
    */

    /**
     * Search for the item in the tree. Return true if the item exists, false otherwise.
     * @param item the item
     * @return boolean true if exists, false otherwise.
     */
    public boolean search(T item) {
        return searchPosition(root, item);
    } // search

    /**
     * The private helper method for search.
     * @param root the root
     * @param item the item
     * @return boolean true if exists, false otherwise
     */
    private boolean searchPosition(NodeType<T> root, T item) {
        if (root == null) return false;
        if (item.compareTo(root.info) <= -1) return searchPosition(root.left, item);
        if (item.compareTo(root.info) >= 1) return searchPosition(root.right, item);
        if (item.compareTo(root.info) == 0) return true;
        return false;
    } // searchPosition

    public void delete(T key) {
        root = deleteHelper(root, key);
    }

    private NodeType<T> deleteHelper(NodeType<T> root, T key) {
        if (root == null) {
            return null;
        } if (key.compareTo(root.info) <= -1) {
            root.left = deleteHelper(root.left, key);
        } if (key.compareTo(root.info) >= 1) {
            root.right = deleteHelper(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } if (root.right == null) {
                return root.left;
            }
            NodeType<T> newNode = deleteMin(root.right);
            root.info = newNode.info;
            root.right = deleteHelper(root.right, newNode.info);
            }
        return root;
        }

    private NodeType<T> deleteMin(NodeType<T> tracker) {
        while (tracker.left != null) {
            tracker = tracker.left;
        }
        return tracker;
    }



    /**
     * Perform In Order Traversal to print out the item in the tree in ascending order.
     */
    public void inOrder(NodeType<T> root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.info + " ");
        inOrder(root.right);
    } // inOrder

}
