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
     * Prints out the node that has only one child.
     * @param root the root
     */
    public void getSingleParent(NodeType<T> root) {
        if (root == null) return;
        else {
            if (root.left != null && root.right == null) {
                System.out.print(root.info + " ");
            } else if (root.left == null && root.right != null) {
                System.out.print(root.info + " ");
            }
        }
        getSingleParent(root.left);
        getSingleParent(root.right);
    } // getSingleParent

    /**
     * Return the number of leaf nodes in the tree.
     * @param root the root
     * @param count the count
     * @return the number of leaf nodes
     */
    public int getNumLeafNodes(NodeType<T> root, int count) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            return getNumLeafNodes(root.left, count) + getNumLeafNodes(root.right, count);
        } //
    }
    /**
     * Perform In Order Traversal to print out the item in the tree in ascending order.
     * @param root the root
     */
    public void inOrder(NodeType<T> root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.info + " ");
        inOrder(root.right);
    } // inOrder

    /**
     * A helper method for the getCousins.
     * @param root the root
     * @param level the level of the tree
     * @param item the item
     * @return the level of the item found
     */
    public int getLevel(NodeType<T> root, int level, T item) {
        if (root == null) {
            return --level;
        } else if (root.info.compareTo(item) == 0) {
            return level;
        } else {
            if (item.compareTo(root.info) >= 1) {
                return getLevel(root.right, level + 1, item);
            }
            if (item.compareTo(root.info) <= -1) {
                return getLevel(root.left, level + 1, item);
            } // if
            return level;
        }

    } // getLevel

    /**
     * Print out of the cousins of a given node.
     * @param root the root
     * @param level the level of the item
     * @param item the item
     */
    public void getCousins(NodeType<T> root, int level, T item) {
        if (root == null) return;
        if (root.left != null) {
            if (root.left.info.compareTo(item) == 0) {
                level++;
                return;
            } else getCousins(root.left, level - 1, item);
        }
        if (root.right != null) {
            if (root.right.info.compareTo(item) == 0) {
                level++;
                return;
            } else getCousins(root.right, level - 1, item);
        }
        if (level == 0) {System.out.println(root.info);}

    } // getCousins
}
