import java.util.*;

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    int radius;

    public Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        Circle(sc.nextInt());
    }

    public Circle(int radius) {
        this.radius = radius;
    }
}

class Square extends Shape {
    int radius;

    public Square() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        Square(sc.nextInt());
    }

    public Circle(int radius) {
        this.radius = radius;
    }
}