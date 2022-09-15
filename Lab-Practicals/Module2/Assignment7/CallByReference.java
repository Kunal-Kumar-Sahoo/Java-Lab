import java.util.*;

class CallByReference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int[] arr = new int[2];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        System.out.println("Before swapping, values outside the function: ");
        System.out.println("a = " + arr[0] + "\tb = " + arr[1]);
        swap(arr);
        System.out.println("After swapping, values outside the function: ");
        System.out.println("a = " + arr[0] + "\tb = " + arr[1]);
    }

    static void swap(int[] arr) {
        System.out.println("Before swapping, values inside the function: ");
        System.out.println("a = " + arr[0] + "\tb = " + arr[1]);
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
        System.out.println("After swapping, values inside the function: ");
        System.out.println("a = " + arr[0] + "\tb = " + arr[1]);
    }
}
