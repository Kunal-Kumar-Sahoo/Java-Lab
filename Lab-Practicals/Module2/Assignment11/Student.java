public class Student {
    protected int rollNo;
    protected String name;
    protected static int studentCount = 0;

    public Student() {
        studentCount++;
    }

    public Student(int rollNo, String name) {
        this.accept(rollNo, name);
        studentCount++;
    }

    public void accept(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void display() {
        System.out.println("Display method of Student class");
        System.out.println("Roll number: " + this.rollNo);
        System.out.println("Name: " + this.name);
    }
}