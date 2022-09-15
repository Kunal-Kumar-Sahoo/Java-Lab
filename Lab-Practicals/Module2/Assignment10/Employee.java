public class Employee {
    protected int ID;
    protected String name;
    protected static int employeeCount = 0;

    public Employee() {
        System.out.println("Employee created");
        System.out.println("ID and names are not initialized.");
        employeeCount++;
    }

    public Employee(int ID, String name) {
        accept(ID, name);
        employeeCount++;
    }

    public void accept(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public void display() {
        System.out.println("Employee ID: " + this.ID);
        System.out.println("Employee Name: " + this.name);
    }
}
