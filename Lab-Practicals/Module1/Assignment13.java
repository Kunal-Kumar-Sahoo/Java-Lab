import java.util.*;

class Calculator {
    void Addition(int num1,int num2) {
        int add=num1+num2;
        System.out.println(("Answer: "+add));
    }
    void Subtraction(int num1,int num2) {
        int sub=num1-num2;
        System.out.println(("Answer: "+sub));
    }
    void Multiplication(int num1,int num2) {
        int mul=num1*num2;
        System.out.println(("Answer: "+mul));
    }
    void Division(int num1,int num2) {
        if (num2!=0) {
            int div=num1/num2;
            System.out.println(("Answer: "+div));
        }
        else   
            System.out.println("Num2 cannot be zero.");
    }
    void squareRoot(int num) {
        double root = Math.sqrt(num);
        System.out.println("The root of "+num+" is "+root);
    }
    void cubeRoot(int num) {
        double root = Math.cbrt(num);
        System.out.println("The cube root of "+num+" is "+root); 
    }
    void square(int num) {
        double root = Math.pow(num,2);
        System.out.println("The square of "+num+" is "+root); 
    }
    void trigo() {
        System.out.println("-----------------");
        System.out.println("1.Sine");
        System.out.println("2.Cosine");
        System.out.println("3.Tangent");
        System.out.println("-----------------");
        Scanner s=new Scanner(System.in);
        int ch=s.nextInt();
        System.out.println("-----------------");
        System.out.println("Enter the angle (in radians) :");
        double angle = s.nextDouble();
        System.out.println("-----------------");
        switch (ch) {
            case 1:
                double ans = Math.sin(angle);
                System.out.println("Answer: "+ans);
                break;
            case 2:
                double ans2 = Math.cos(angle);
                System.out.println("Answer: "+ans2);
                break;
            case 3:
                double ans3 = Math.tan(angle);
                System.out.println("Answer: "+ans3);
                break;
            default:
                System.out.println("The entered choice is invalid!!");
        }
        s.close();
    }
}

public class Assignment13 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("Enter your choice of operation:");
        System.out.println("-----------------------------------");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Square Root");
        System.out.println("6.Cube root");
        System.out.println("7.Square");
        System.out.println("8.Trigonometric Functions");
        System.out.println("-----------------------------------");
        Scanner sc = new Scanner(System.in);
        int ch1 = sc.nextInt();
        Calculator obj = new Calculator();
        if (ch1 == 1|| ch1==2||ch1==3||ch1==4) {
            int num1,num2;
            System.out.println("Enter num1:");
            num1 = sc.nextInt();
            System.out.println("Enter num2:");
            num2 = sc.nextInt();
            if (ch1==1)
                obj.Addition(num1, num2);
            else if(ch1==2)
                obj.Subtraction(num1, num2);
            else if (ch1==3)
                obj.Multiplication(num1, num2);
            else if(ch1==4)
                obj.Division(num1, num2);
        }
        else if(ch1==5||ch1==6||ch1==7) {
            int num;
            System.out.println("Enter a number to be operated upon:");
            num = sc.nextInt();
            if (ch1==5)
                obj.squareRoot(num);
            else if(ch1==6)
                obj.cubeRoot(num);
            else if(ch1==7)
                obj.square(num);
        }
        else if(ch1==8)
            obj.trigo();
        else
            System.out.println("Invalid Choice!!!!");
        sc.close();
    }
}