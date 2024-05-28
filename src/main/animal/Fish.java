package main.animal;

public class Fish extends Animal{
    private boolean hasScales;

    public Fish(String name, int age, boolean hasScales) {
        super(name, age);
        this.hasScales = hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }

    public boolean getHasScales() {
        return hasScales;
    }

    @Override
    public void makeSound() {
        // The default implementation of makeSound() for fish does nothing.
    }

    @Override
    public void move() {
        // The default implementation of move() for fish does nothing.
    }
}
