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
    } // main


} // class
