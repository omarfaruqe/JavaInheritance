package main.shape;

public class Parallelogram extends Shape{
    private double base;
    private double height;

    public Parallelogram(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public double getPerimeter() {
        // The perimeter of a parallelogram is 2 * (base + side),
        // where side is the length of the side that is not the base.
        // In this example, we assume that the side is equal to the base.
        return 4 * base;
    }
}
