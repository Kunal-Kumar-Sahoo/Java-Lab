// Write a java program to find the area Geometric figures using method overloading

import java.util.*;

class Assignment12 {
    static float calculateArea(float side) {
        // calculate the area of a square
        return (float)Math.pow(side, 2);
    }

    static float calculateArea(float length, float breadth) {
        // calculate the area of a rectangle
        return length * breadth;
    }

    static float calculateArea(float a, float b, float c) {
        // return the area of a triangle given its sides
        float s = (a+b+c)/2;
        return (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    static double calculateArea(double radius) {
        // return the area of a circle
        return Math.PI*Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        System.out.println("Area of a square: " + calculateArea(4));
        System.out.println("Area of a rectangle: " + calculateArea(2, 4));
        System.out.println("Area of a triangle: " + calculateArea(3, 4, 5));
        System.out.println("Area of a circle: " + calculateArea(1/Math.sqrt(Math.PI)));
    }
}
