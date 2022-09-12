import java.util.*;

class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a mathematical expression containing two operands and an operation(+,-,*,/,%,^):");
        double a = sc.nextDouble();
        char op = sc.next().charAt(0);
        double b = sc.nextDouble();
        double ans = 0;
        try {
            switch(op) {
                case '+' -> ans = a+b;
                case '-' -> ans = a-b;
                case '*' -> ans = a*b;
                case '/' -> ans = a/b;
                case '%' -> ans = a%b;
                case '^' -> ans = Math.pow(a, b);
                default -> System.out.println("Enter a correct operation!");
            }
            System.out.println("Answer: " + ans);
        } catch(Exception e) {System.out.println(e);}

        sc.close();
    }
}
