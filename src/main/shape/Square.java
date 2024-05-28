package main.shape;

public class Square extends Rectangle{
    public Square(String color, double side) {
        super(color, side, side);
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    public double getSide() {
        return super.getWidth();
    }

    @Override
    public double getArea() {
        return Math.pow(getSide(), 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * getSide();
    }
}
