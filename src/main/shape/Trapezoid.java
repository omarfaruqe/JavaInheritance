package main.shape;

public class Trapezoid extends Shape{
    private double base1;
    private double base2;
    private double height;

    public Trapezoid(String color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getBase1() {
        return base1;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    public double getBase2() {
        return base2;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public double getPerimeter() {
        // The perimeter of a trapezoid is the sum of the lengths of all its sides.
        // In this example, we assume that the sides that are not the bases are equal in length.
        return base1 + base2 + 2 * Math.sqrt(Math.pow((base1 - base2) / 2, 2) + Math.pow(height, 2));
    }
}
