import java.util.*;

class Main {
    public static void main(String[] args) {
        Student s1 = new Student(100, "Dev Parikh");
        EngineeringStudent s2 = new EngineeringStudent(101, "Aum Pandya", "Autombile Engineering");
        CSE_Student s3 = new CSE_Student(102, "Kunal", "Python3");

        s1.display();
        s2.display();
        s3.display();
    }
}