import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1, s2, s3;

        System.out.println("Default constructor for s1:");
        s1 = new Student();
        s1.display();

        System.out.println("Parameterized constructor for s2:");
        System.out.print("Enter name of the student: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        System.out.print("Enter CGPA: ");
        float cgpa = sc.nextFloat();
        s2 = new Student(roll, name, cgpa);
        s2.display();
        
        System.out.println("Copy constructor for s3:");
        s3 = new Student(s2);
        s3.display();
    }
}
