public class Engineer extends Employee{
    protected String company;
    protected int engineerCount = 0;

    public Engineer() {
        engineerCount++;
    }

    public Engineer(int ID, String name, String company) {
        super(ID, name);
        accept(company);
        engineerCount++;
    }

    public void accept(String company) {
        this.company = company;
    }

    public void display() {
        super.display();
        System.out.println("Company: " + this.company);
    }
}
