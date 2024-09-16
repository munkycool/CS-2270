public class CashRegisterTest {
    public static void main(String[] args) {
        CashRegister register = new CashRegister(0.07);

        register.addItem(9.99);
        register.addItem(8.99);

        double subtotal = register.getSubTotal();
        System.out.println("Subtotal is: " + subtotal);

        double tax = register.getTax();
        System.out.println("Tax is: " + tax);

        double total = register.getTotal();
        System.out.println("Total is: " + total);
    }
}
