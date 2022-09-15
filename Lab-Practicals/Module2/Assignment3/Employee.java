public class Employee {
    protected int ID;
    protected String name;
    protected static int count = 0;

    public Employee() {
        this.ID = 0;
        this.name = "Not assigned";
        Employee.count++;
    }

    public Employee(int ID, String name) {
        this.ID = ID;
        this.name = name;
        Employee.count++;
    }

    public Employee(Employee emp) {
        this.ID = emp.ID;
        this.name = emp.name;
        Employee.count++;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

    public static int getCount() {
        return Employee.count;
    }

    public String toString() {
        return "ID: " + this.ID + "\tName: " + this.name;
    }

    public void finalize() {
        Employee.count--;
    }
}
