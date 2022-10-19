import java.util.*;

class ReturningValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of the array:");
        for(int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter an element to search: ");
        int x = sc.nextInt();
        int idx = search(arr, x);
        if(idx == -1)
            System.out.println("Element not found");
        else System.out.println("Element found at index: " + idx);
    }   

    static int search(int[] arr, int x) {
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == x)
            return i;
        return -1;
    }

}
