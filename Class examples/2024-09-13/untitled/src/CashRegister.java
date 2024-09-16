public class CashRegister {

    private double totalCost;
    private double taxRate;
    private double tax;
    private double subTotal;

    public CashRegister(double taxRate) {
        this.taxRate = taxRate;
    }

    public void addItem(double price) {
        subTotal += price;
        tax += price * taxRate;
        totalCost = subTotal + tax;
    }

    public double getTotal() {
        return totalCost;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public double getTax() {
        return tax;
    }
}
