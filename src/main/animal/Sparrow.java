package main.animal;

public class Sparrow extends Bird{
    public Sparrow(String name, int age, boolean canFly) {
        super(name, age, canFly);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }

    @Override
    public void move() {
        System.out.println("The sparrow is flying.");
    }
}
