import java.util.*;

class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(10, "Ram");
        Employee emp2 = new Teacher(11, "Anand", "M.Tech");
        // Teacher emp3 = (Teacher) new Employee();

        System.out.println("Employee 1: " + emp1.toString());
        System.out.println("Employee 2: " + emp2.toString());
        // System.out.println("Employee 3: " + emp3.toString());
    }
}