package main.animal;

public class Tuna extends Fish{
    public Tuna(String name, int age, boolean hasScales) {
        super(name, age, hasScales);
    }

    @Override
    public void makeSound() {
        // Tuna fish do not make any sounds.
    }

    @Override
    public void move() {
        System.out.println("The tuna is swimming.");
    }
}
