package vroom;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car(30, 10);
        myCar.setMake("Ford Fiesta");
        myCar.addFuel(10);
        myCar.drive(300);
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Miles driven: 300");
        System.out.println("Fuel level: " + myCar.getLevel());
    }
}
