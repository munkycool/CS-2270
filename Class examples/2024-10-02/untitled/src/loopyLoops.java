import java.util.Scanner;

public class loopyLoops {
    void main() {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Continue? (y or n): ");
        String userInput = scnr.next();

        if (userInput.equals("y")) {
            System.out.println("Continuing ...");
        }
        else {
            System.out.println("Exiting ...");
        }

        System.out.println("Bye-bye now...");
    }
}
