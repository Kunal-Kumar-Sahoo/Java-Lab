import java.util.*;

class Assignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // upper half
        for(int i=0; i<n; i++) {
            // spaces
            for(int j=0; j<n-i-1; j++)
                System.out.print(" ");
            // stars
            for(int j=0; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        // lower half
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<=i; j++)
                System.out.print(" ");
            for(int j=0; j<n-1-i; j++)
                System.out.print("* ");
            System.out.println();
        }

        sc.close();
    }
}
