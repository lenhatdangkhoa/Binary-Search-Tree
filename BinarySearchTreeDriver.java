import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * The main driver class
 */
public class BinarySearchTreeDriver {

    /**
     * Main method.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter list type (i - int, d - double, s - string): ");
        String type = scan.nextLine();
        System.out.println("Commands:\n(i) - Insert Item\n(d) - Delete Item\n(p) - Print Tree");
        System.out.println("(s) - Search Item\n(l) - Count Leaf Nodes\n(sp) - Find Single Parents");
        System.out.println("(c) - Find Cousins\n(q) - Quit program");
        System.out.print("Enter a command: ");
        String command = scan.nextLine();
        while (!command.equals("q")) {
            switch (command) {
            case "i":
                break;
            case "d":
                break;
            case "p":
                break;
            case "s":
                break;
            case "l":
                break;
            case "sp":
                break;
            case "c":
                break;
            default:
                System.out.println("Invalid Command. Please try again");
                break;
            } // switch
            System.out.print("Enter a command: ");
            command = scan.nextLine();
        } // while
        */
        /*
        NodeType<Integer> root = new NodeType<>();
        root.info = 3;
        root.left = new NodeType<Integer>();
        root.left.info = 2;
        root.right = new NodeType<Integer>();
        root.right.info = 6;
        root.right.left = new NodeType<Integer>();
        root.right.left.info = 5;
        root.right.right = new NodeType<Integer>();
        root.right.right.info = 8;
        */
        /*
        System.out.println(root.info);
        System.out.println(root.left.info);
        System.out.println(root.right.info);
        System.out.println(root.right.left.info);
        System.out.println(root.right.right.info);
        */
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.root.info = 1;
        tree.insert(2);
        tree.insert(0);
        tree.insert(3);
        tree.insert(4);
        tree.insert(10);
        tree.insert(9);
        tree.insert(20);
        tree.insert(-3);
        tree.insert(-1);
        tree.insert(-2);
        tree.insert(7);
        tree.insert(11);
        tree.insert(25);
        //tree.inOrder(tree.root);
        //System.out.println();
        //tree.getSingleParent(tree.root);
        //System.out.println(tree.getNumLeafNodes(tree.root, 0));
        //System.out.println(tree.getLevel(tree.root, 0,25));
        //tree.delete(0);
        //System.out.println(tree.search(3));
        //   tree.delete(2);
        //System.out.println(tree.root.left.info);
        //System.out.println(tree.search(2));
        //System.out.println(tree.search(10));
        //System.out.println(tree.search(4));

        //System.out.println(tree.root.info);
        //System.out.println(tree.root.right.info);
        //System.out.println(tree.root.left.info);

    } // main


} // class
