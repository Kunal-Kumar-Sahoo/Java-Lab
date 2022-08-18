// Write a java program to perform mathematical operations on 2 numbers

import java.util.Scanner;

class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
    
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        double answer = 0;

        try {
            switch(operator) {
                case '+' -> answer = number1 + number2;
                case '-' -> answer = number1 - number2;
                case '*' -> answer = number1 * number2;
                case '%' -> answer = number1 % number2;
                case '/' -> answer = number1 / number2;
                default -> System.out.println("Invalid operation");
            }
            System.out.println("Answer: " + answer);
        } catch(Exception e) {
            System.out.println(e);
        }
        
        sc.close();
    }
}
