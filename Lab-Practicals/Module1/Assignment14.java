import java.util.*;

class Assignment14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for(int i=0; i<n; i++) 
            arr[i] = sc.nextInt();
        sc.close();
        System.out.println("Original array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }

    static void sort(int[] arr) {
        boolean swapped;
        for(int i=0; i<arr.length; i++) {
            swapped = false;
            for(int j=1; j<arr.length-i; j++)
                if(arr[j-1] > arr[j]) {
                    swap(arr, j-1, j);
                    swapped = true;
            }
            if(!swapped) break;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
