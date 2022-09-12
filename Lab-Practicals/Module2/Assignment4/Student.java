public class Student {
    private int rollNo;
    private String name;
    private float cgpa;

    public static int count = 0;

    public Student() {
        this.rollNo = 0;
        this.name = null;
        this.cgpa = 0.0f;
        count++;
    }

    public Student(int rollNo, String name, float cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
        count++;
    }

    public Student(Student s) {
        this.rollNo = s.rollNo;
        this.name = s.name;
        this.cgpa = s.cgpa;
        count++;
    }

    public void display() {
        System.out.println("Roll number: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("CGPA: " + this.cgpa);
    }
}
