package main.employee;

public class Salesperson extends Employee{
    private double totalSales;

    public Salesperson(String name, int id, double salary, double totalSales) {
        super(name, id, salary);
        this.totalSales = totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    @Override
    public double getBonus() {
        // The bonus for a salesperson is 10% of their total sales.
        return 0.1 * totalSales;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Total sales: " + totalSales);
    }
}
