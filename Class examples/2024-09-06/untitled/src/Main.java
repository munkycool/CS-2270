import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Rectangle happyRectangle;
        happyRectangle = new Rectangle(8, 6);
        Rectangle r2 = new Rectangle(8,6);

        happyRectangle.getHeight();

        greeter("Artemis", 20);
    }
    public static String greeter(String name, int age) {
        System.out.println("Hello, " + name + "!");
        System.out.println("You're " +age + " years old lmao.");
        return "Hello, " + name + "!";
    }
}