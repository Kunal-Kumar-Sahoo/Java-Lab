class Student {
    protected int rollNo;
    protected String name;
    protected static int studentCount = 0;

    public Student() {
        studentCount++;
    }

    public Student(int rollNo, String name) {
        studentCount++;
        accept(rollNo, name);
    }

    public void accept(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void display() {
        System.out.println("No of students: " + studentCount);
        System.out.println("Name of the student: " + this.name);
        System.out.println("Roll number of the student: " + this.rollNo);
    }
}

class EnggStudent extends Student {
    protected String branch;
    protected static int enggStudentCount = 0;

    public EnggStudent() {
        studentCount++;
    }

    public EnggStudent(int rollNo, String name, String branch) {
        super(rollNo, name);
        accept(branch);
        enggStudentCount++;
    }

    public void accept(String branch) {
        this.branch = branch;
    }

    public void display() {
        super.display();
        System.out.println("No. of engineering students: " + enggStudentCount);
        System.out.println("Branch of student: " + this.branch);
    }
}

class SimpleInheritance {
    public static void main(String[] args) {
        EnggStudent es1 = new EnggStudent(100, "Kunal Kumar Sahoo", "Computer Engineering");
        es1.display();
    }
}
