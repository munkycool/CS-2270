import java.util.Scanner;

public class LogicExamples {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int c = 25;
//        int x = 0;
//
//        if (a > b) {
//            if (b > c) {
//                x = 5;
//            }
//        }
//        // Wrong
////        if (a > b > c) {
////            x = 5;
////        }
//        // && means and
//        // truth table
//        // x  y   x && y
//        // T  T   T
//        // T  F   F
//        // F  T   F
//        // F  F   F
//
//        if (a > b && b > c) {
//            x = 5;
//        }
//        // || means or
//        // truth table
//        // x  y   x || y
//        // T  T   T
//        // T  F   T
//        // F  T   T
//        // F  F   F
//
//        if (a > b || b > c) {
//            x = 5;
//        }
//
//        if (a > b) {
//            x = 5;
//        } else if (b > c) {
//            x = 5;
//        }
//
//        // out of context quotes: "It's an important skill to be able to go both ways."
//
//        // short circuit logic
//        // if the first condition is false, the second condition is not evaluated
//        if (checkAndPrintA() && checkAndPrintB()) {
//            x = 5;
//        }
//
//        // if the first condition is true, the second condition is not evaluated
//        if (checkAndPrintA() || checkAndPrintB()) {
//            x = 5;
//        }

        String password = "artemis21";
        String userInput = "artemis21";

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your password: ");
        userInput = scnr.next();

        if (password.equals(userInput)) {
            System.out.println("You are logged in!");
        } else {
            System.out.println("Incorrect password.");
        }
    }

}
