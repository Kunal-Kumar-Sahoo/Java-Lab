import java.util.*;

class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = sc.next();

        for(int i=0; i<word.length(); i++) {
            // spaces
            for(int j=0; j<word.length()-i-1; j++)
                System.out.print(" ");
            // Characters
            for(int j=0; j<=i; j++)
                System.out.print(word.charAt(j) + " ");
            System.out.println();
        }

        sc.close();
    }
}
