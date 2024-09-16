package lab2;

public class StringTest {

    public static void main(String[] args) {
        String message = "Hello, World!";
        int theLength = message.length();
        System.out.println(theLength);

        char theChar = message.charAt(0);
        System.out.println(theChar);

        theChar = message.charAt(1);
        System.out.println(theChar);

        message = message.toUpperCase();
        System.out.println(message);

        String firstFive = message.substring(0, 5);

        System.out.println(firstFive);
    }
}
