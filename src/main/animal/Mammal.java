package main.animal;

public class Mammal extends Animal{
    private boolean hasFur;

    public Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public boolean getHasFur() {
        return hasFur;
    }

    @Override
    public void makeSound() {
        // The default implementation of makeSound() for mammals does nothing.
    }

    @Override
    public void move() {
        // The default implementation of move() for mammals does nothing.
    }
}
