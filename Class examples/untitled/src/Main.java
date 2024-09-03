import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declare a variable
        int x;

        // initialize variable
        x = 5;
        int y = 10;

        int x2 = (x + 10) / 20;
        int x3 = (x2 + 10) / 20;
        int x4 = (x3 + 10) / 20;

        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);

        // examples of modular arithmetic

        int eggs = 78;
        int fullEggCartons = eggs / 12;
        int remainingEggs = eggs % 12;

        System.out.println("Full egg cartons: " + fullEggCartons);
        System.out.println("Remaining eggs: " + remainingEggs);

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter amount in cents: ");
        int ammount = scnr.nextInt();
        int quarters = ammount / 25;
        int dimes = (ammount % 25) / 10;
        int nickels = ((ammount % 25) % 10) / 5;
        int pennies = ((ammount % 25) % 10) % 5;

        System.out.println("Quarters: " + quarters + "\nDimes: " + dimes + "\nNickels: " + nickels + "\nPennies: " + pennies);

    }
}