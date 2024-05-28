package main.employee;

public class Manager extends Employee{
    private int numOfEmployees;

    public Manager(String name, int id, double salary, int numOfEmployees) {
        super(name, id, salary);
        this.numOfEmployees = numOfEmployees;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    @Override
    public double getBonus() {
        // The bonus for a manager is 10% of their salary for each employee they manage.
        return 0.1 * salary * numOfEmployees;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Number of employees managed: " + numOfEmployees);
    }
}
