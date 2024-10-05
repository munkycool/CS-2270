import java.util.Scanner;

public class loopyLoops {
    void main() {
//        Scanner scnr = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Continue? (y or n): ");
//            String userInput = scnr.next();
//
//            if (userInput.equals("y")) {
//                System.out.println("Continuing ...");
//            } else {
//                System.out.println("Exiting ...");
//                break;
//            }
//        }
//        System.out.println("Bye-bye now...");

        //countToTen();
        //liftOff();
        int days = howLongCanIEat(300);
        System.out.println("You can eat for " + days + " days.");
    }

    void countToTen() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    void liftOff() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

    int howLongCanIEat(double m) {
        int days = 0;

        while (m >= 20) {
            m -= 20;
            m *= 0.90;
            days++;
        }

        return days;
    }
}
