package main.employee;

public class SupportStaff extends Employee{
    private boolean isOnCall;

    public SupportStaff(String name, int id, double salary, boolean isOnCall) {
        super(name, id, salary);
        this.isOnCall = isOnCall;
    }

    public void setIsOnCall(boolean isOnCall) {
        this.isOnCall = isOnCall;
    }

    public boolean getIsOnCall() {
        return isOnCall;
    }

    @Override
    public double getBonus() {
        // The default implementation of getBonus() for support staff returns 0.
        return 0;
    }

    @Override
    public String display() {
        String toDisplay = super.display();
        System.out.println("On call: " + isOnCall);
        toDisplay = toDisplay + "\nOn call: " + isOnCall;
        return toDisplay;
    }
}
