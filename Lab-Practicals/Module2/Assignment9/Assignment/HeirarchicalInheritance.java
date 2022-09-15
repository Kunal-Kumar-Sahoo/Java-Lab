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

class CSE_Student extends EnggStudent {
    protected String os, programmingLanguage;
    protected static int cseStudent = 0;

    public CSE_Student() {
        cseStudent++;
    }

    public CSE_Student(int rollNo, String name, String os, String programmingLanguage) {
        super(rollNo, name, "Computer Engineering");
        accept(os, programmingLanguage);
        cseStudent++;
    }

    public void accept(String os, String programmingLanguage) {
        this.os = os;
        this.programmingLanguage = programmingLanguage;
    }

    public void display() {
        super.display();
        System.out.println("No. of Computer Engineering students: " + cseStudent);
        System.out.println("Operating System: " + this.os);
        System.out.println("Programming language: " + this.programmingLanguage);
    }
}

class AutomobileStudent extends EnggStudent {
    protected String car, software;
    protected static int automobileStudent = 0;

    public AutomobileStudent() {
        automobileStudent++;
    }

    public AutomobileStudent(int rollNo, String name, String car, String software) {
        super(rollNo, name, "Automobile Engineering");
        accept(car, software);
        automobileStudent++;
    }

    public void accept(String car, String software) {
        this.car = car;
        this.software = software;
    }

    public void display() {
        super.display();
        System.out.println("No. of Automobile Engineering students: " + automobileStudent);
        System.out.println("Car: " + this.car);
        System.out.println("Software: " + this.software);
    }
}

class HeirarchicalInheritance {
    public static void main(String[] args) {
        CSE_Student es1 = new CSE_Student(100, "Kunal Kumar Sahoo", "Arch Linux", "Python3");
        es1.display();
        AutomobileStudent es2 = new AutomobileStudent(169, "Aum", "Ferrari", "SolidWorks");
        es2.display();
    }
}
