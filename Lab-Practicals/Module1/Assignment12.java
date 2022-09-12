// Method overloading

import java.util.*;

class Assignment12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area;
        
        System.out.println("Triangle: ");
        System.out.println("Enter length of three sides of the triangle");
        area = area(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Area of triangle: " + area);

        System.out.println("Circle:");
        System.out.print("Enter radius of circle: ");
        area = area(sc.nextDouble());
        System.out.println("Area of circle: " + area);

        System.out.println("Parallelogram:");
        System.out.print("Enter base and height of parallelogram: ");
        area = area(sc.nextDouble(), sc.nextDouble());
        System.out.println("Area of parallelogram: " + area);

        sc.close();
    }

    static double area(double side1, double side2, double side3) {
        // Area of a triangle
        double semiPerimeter = (side1+side2+side3) / 2;
        return Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3));
    }

    static double area(double radius) {
        // Area of a circle
        return Math.PI * radius * radius;
    }

    static double area(double base, double height) {
        // Area of rectangle, parallelogram
        return base * height;
    }
}
