public class SimpleRectangle {
    // Making it private allows us to change things without having to change a bunch of things out in the codebase
    private double width;
    private double height;

    public SimpleRectangle() {
        width = 0;
        height = 0;
    }

    // This is replacing the work of the setters
    public SimpleRectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    public void setWidth(double w) {
        width = w;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //Example of a mutator method
    public void grow(double w, double h) {
        width += w;
        height += h;
    }
}
