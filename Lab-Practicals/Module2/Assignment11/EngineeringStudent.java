public class EngineeringStudent extends Student{
    protected String branch;
    protected static int engineeringStudentCount = 0;

    public EngineeringStudent() {engineeringStudentCount++;}

    public EngineeringStudent(int rollNo, String name, String branch) {
        super(rollNo, name);
        accept(branch);
        engineeringStudentCount++;
    }

    public void accept(String branch) {
        this.branch = branch;
    }

    public void display() {
        System.out.println("Display method of EngineeringStudent class");
        System.out.println("Roll number: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Branch: " + this.branch);
    }
}