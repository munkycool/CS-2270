package vroom;

public class Car {
    private String make;
    private String model;
    private double mpg;
    //private double fuelLevel;
    private GasTank gasTank;

    public Car(double mpg, double capacity) {
        this.mpg = mpg;
        GasTank gasTank = new GasTank(capacity);
    }

    public void addFuel(double gallons) {
        // Add gallons of fuel to the car's tank
        //fuelLevel += gallons;
        gasTank.addFuel(gallons);
    }

    public void drive(int miles) {
        double fuelUsed = miles / mpg;
        //fuelLevel -= fuelUsed;
        gasTank.useFuel(fuelUsed);

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getLevel() {
        return gasTank.getLevel();
    }
}
