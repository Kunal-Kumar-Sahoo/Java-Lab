import java.util.*;

class CallByValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping, values outside the function: ");
        System.out.println("a = " + a + "\tb = " + b);
        swap(a, b);
        System.out.println("After swapping, values outside the function: ");
        System.out.println("a = " + a + "\tb = " + b);
    }

    static void swap(int a, int b) {
        System.out.println("Before swapping, values inside the function: ");
        System.out.println("a = " + a + "\tb = " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("After swapping, values inside the function: ");
        System.out.println("a = " + a + "\tb = " + b);
    }
}
