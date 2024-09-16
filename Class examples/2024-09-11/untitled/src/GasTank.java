public class GasTank {
    // We first have to think what means to be a gas tank

    private double level;
    private double capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }


    public void addFuel(double fuel) {
        level += fuel;
        level = Math.min(level, capacity);
    }

    public double getLevel() {
        return level;
    }
}

