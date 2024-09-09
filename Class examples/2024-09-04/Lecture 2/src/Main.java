public class Main {
    public static void main(String[] args) {
        int i = 29;
        double d = 29;

        double num = d / 100 * 100;

        System.out.println(num);

        int one = 1;
        int x = 0;
        double num2 = 1 / 0.0;

        double num3 = Double.POSITIVE_INFINITY;
        double num4 = Double.NaN;

        System.out.println(num2);

        double num5 = Math.round(num);
        System.out.println(num5);

        int numRider = 0;
        int maxCapacity = 50;

        // add one rider

        numRider = Math.min(numRider + 1, maxCapacity);
    }
}