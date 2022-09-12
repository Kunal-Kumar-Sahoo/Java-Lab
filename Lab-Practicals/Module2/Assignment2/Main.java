import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Default constructor:");
        Distance d1 = new Distance();
        d1.display();

        System.out.println("Parameterized constructor:");
        System.out.println("Enter distances in feet and inches respectively: ");
        Distance d2 = new Distance(sc.nextInt(), sc.nextInt());
        d2.display();

        System.out.println("Copy constructor:");
        Distance d3 = new Distance(d2);
        d3.display();

    }
}
