public class Conditionals {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = b + a;

        boolean isON;

        isON = true;
        isON = false;

        // == equals (or in my mind, *is*)
        // <, >
        // <=, >=
        // != not equals (*is not*)

        if (a < 5) {
            if (isON) {
                System.out.println("a is less than 5 and isON is true");
            } else {
                System.out.println("a is less than 5 and isOn is false");
            }
        }
        else {
            System.out.println("a is not less than 5");
        }

        boolean x = true, y = false, z = true;

        if (x) {
            System.out.println("x is true");
        } else {
            if (y) {
                System.out.println("y is true");
            } else {
                if (z) {
                    System.out.println("z is true");
                } else {
                    System.out.println("else");
                }
            }
        }

        // pick one option with priority
        // there's actually a shortcut to write this type of logic.
        // You should also have as little nesting as possible

        if (x) {
            System.out.println("x is true");
        } else if (y) {
            System.out.println("y is true");
        } else if (z) {
            System.out.println("z is true");
        } else { // can be thought of as the default case
            System.out.println("else");
        }
    }
}
