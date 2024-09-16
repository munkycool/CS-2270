public class GasTankTest {
    public static void main(String[] args) {
        GasTank tank = new GasTank(10);

        //tank.setCapacity(10);
        tank.addFuel(5);

        // Expected output: 5.0
        System.out.println(tank.getLevel());

        // Expected output: 7.0
        tank.addFuel(-7);
        System.out.println(tank.getLevel());

        tank.addFuel(20);

        // Expected output: 10.0
        System.out.println(tank.getLevel());
    }
}
