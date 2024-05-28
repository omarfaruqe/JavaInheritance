package main.employee;

public class SoftwareEngineer extends Employee{
    private int numOfProjects;

    public SoftwareEngineer(String name, int id, double salary, int numOfProjects) {
        super(name, id, salary);
        this.numOfProjects = numOfProjects;
    }

    public void setNumOfProjects(int numOfProjects) {
        this.numOfProjects = numOfProjects;
    }

    public int getNumOfProjects() {
        return numOfProjects;
    }

    @Override
    public double getBonus() {
        // The bonus for a software engineer is 5% of their salary for each project they complete.
        return 0.05 * salary * numOfProjects;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Number of projects: " + numOfProjects);
    }
}
