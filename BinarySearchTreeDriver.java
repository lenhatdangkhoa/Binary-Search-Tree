import java.util.Scanner;
import java.io.*;

/**
 * The main driver class
 */
@SuppressWarnings("unchecked")
public class BinarySearchTreeDriver {

    /**
     * Main method.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter list type (i - int, d - double, s - string): ");
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        try {
            scan = new Scanner(new File(args[0]));
            if (type.equals("i")) {
                BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
                while (scan.hasNext()) {
                    tree.insert(Integer.parseInt(scan.next()));
                }
                scan = new Scanner(System.in);
                promptUser(scan, tree,"int");
            } else if (type.equals("d")) {
                BinarySearchTree<Double> tree = new BinarySearchTree<Double>();
                while (scan.hasNext()) {
                    tree.insert(Double.parseDouble(scan.next()));
                }
                scan = new Scanner(System.in);
                promptUser(scan,tree,"double");
            } else if (type.equals("s")) {
                BinarySearchTree<String> tree = new BinarySearchTree<String>();
                while (scan.hasNext()) {
                    tree.insert(scan.next());
                }
                scan = new Scanner(System.in);
                promptUser(scan, tree, "string");
            }
        } catch (FileNotFoundException fnfe) {}
    } // try-catch



/**
 * Prompt the user to enter input.
 * @param scanner scanner
 * @param tree binary search tree
 * @param type type of tree
 */
    static void promptUser(Scanner scan, BinarySearchTree tree, String type) {
        System.out.println("Commands:\n(i) - Insert Item\n(d) - Delete Item\n(p) - Print Tree");
        System.out.println("(s) - Search Item\n(l) - Count Leaf Nodes\n(sp) - Find Single Parents");
        System.out.println("(c) - Find Cousins\n(q) - Quit program");
        System.out.print("Enter a command: ");
        String command = scan.nextLine();
        while (!command.equals("q")) {
            switch (command) {
            case "i":
                System.out.print("In-order: ");
                tree.inOrder(tree.root);
                System.out.println();
                if (type.equals("string")) System.out.print("Enter a string to insert: ");
                else System.out.print("Enter a number to insert: ");
                if (type.equals("string")) {
                    String item = scan.nextLine();
                    tree.insert(item);
                } else if (type.equals("int")) {
                    Integer item = Integer.parseInt(scan.nextLine());
                    tree.insert(item);
                } else {
                    Double item = Double.parseDouble(scan.nextLine());
                    tree.insert(item);
                }
                System.out.print("In-order: ");
                tree.inOrder(tree.root);
                System.out.println();
                break;
            case "d":
                System.out.print("In-order: ");
                tree.inOrder(tree.root);
                System.out.println();
                if (type.equals("string")) System.out.print("Enter a string to delete: ");
                else System.out.print("Enter a number to delete: ");
                if (type.equals("string")) {
                    String item = scan.nextLine();
                    if (tree.search(item)) {
                        tree.delete(item);
                        System.out.print("In-order: ");
                        tree.inOrder(tree.root);
                        System.out.println();
                        tree.delete(item);
                    }
                    else System.out.println("Item is not present in the tree");
                } else if (type.equals("int")) {
                    Integer item = Integer.parseInt(scan.nextLine());
                    if (tree.search(item)) {
                        tree.delete(item);
                        tree.delete(item);
                        System.out.print("In-order: ");
                        tree.inOrder(tree.root);
                        System.out.println();
                    }
                    else System.out.println("The number is not present in the tree");
                } else {
                    Double item = Double.parseDouble(scan.nextLine());
                    if (tree.search(item)) {
                        tree.delete(item);
                        System.out.print("In-order: ");
                        tree.inOrder(tree.root);
                        System.out.println();
                    }
                    else System.out.println("The number is not present in the tree");
                }
                break;
            case "p":
                System.out.print("In-order: ");
                tree.inOrder(tree.root);
                System.out.println();
                break;
            case "s":
                System.out.print("In-order: ");
                tree.inOrder(tree.root);
                System.out.println();
                if (type.equals("string")) System.out.print("Enter a string to search: ");
                else System.out.print("Enter a number to search: ");
                if (type.equals("string")) {
                    String item = scan.nextLine();
                    if (tree.search(item))
                        System.out.println("Item is present in tree");
                    else
                        System.out.println("Item is not present in tree");
                } else if (type.equals("int")) {
                    Integer item = Integer.parseInt(scan.nextLine());
                    if (tree.search(item))
                        System.out.println("Item is present in tree");
                    else
                        System.out.println("Item is not present in tree");
                } else {
                    Double item = Double.parseDouble(scan.nextLine());
                    if (tree.search(item))
                        System.out.println("Item is present in tree");
                    else
                        System.out.println("Item is not present in tree");
                }
                break;
            case "l":
                System.out.println("The number of leaf nodes are " + tree.getNumLeafNodes(tree.root,0));
                break;
            case "sp":
                System.out.print("Single Parents: ");
                tree.getSingleParent(tree.root);
                System.out.println();
                break;
            case "c":
                System.out.print("In-order: ");
                tree.inOrder(tree.root);
                System.out.println();
                if (type.equals("string")) System.out.print("Enter a string: ");
                else System.out.print("Enter a number: ");
                if (type.equals("string")) {
                    String item = scan.nextLine();
                    System.out.print(item + " cousins: ");
                    tree.getCousins(tree.root, tree.getLevel(tree.root,0, item), item);
                    System.out.println();
                } else if (type.equals("int")) {
                    Integer item = Integer.parseInt(scan.nextLine());
                    System.out.print(item + " cousins: ");
                    tree.getCousins(tree.root, tree.getLevel(tree.root,0,item), item);
                    System.out.println();
                } else {
                    Double item = Double.parseDouble(scan.nextLine());
                    System.out.print(item + " cousins: ");
                    tree.getCousins(tree.root, tree.getLevel(tree.root,0,item), item);
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid Command. Please try again");
                break;
            } // switch
            System.out.print("Enter a command: ");
            command = scan.nextLine();
        } // while
    }

} // class
