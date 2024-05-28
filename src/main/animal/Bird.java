package main.animal;

public class Bird extends Animal{
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean getCanFly() {
        return canFly;
    }

    @Override
    public void makeSound() {
        // The default implementation of makeSound() for birds does nothing.
    }

    @Override
    public void move() {
        // The default implementation of move() for birds does nothing.
    }
}
