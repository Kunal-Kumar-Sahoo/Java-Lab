// Write a java program to print first n Prime numbers.

import java.util.Scanner;
import java.lang.Math;

class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int count = 0;
        for(int i=2; count<n; i++) {
            boolean found = true;
            for(int j=2; j<=Math.sqrt(i); j++) 
                if(i%j == 0) {
                    found = false;
                    break;
                }
            if(found) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        sc.close();
    }
}
 /*
    Dry run:
    n = 5
        count = 0, i = 2
            j = 1 -> Print
        count = 1, i = 3
            j = 1 -> Print
        count = 2, i = 4
            j = 2 -> break
        count = 2, i = 5
            j = 2 -> Print
        count = 3, i = 6
            j = 2 -> break
        count = 3, i = 7
            j = 2 -> Print
        count = 4, i = 8
            j = 2 -> break
        count = 4, i = 9
            j = 2, 3 -> break
        count = 4, i = 10
            j = 2 -> break
        count = 4, i = 11
            j = 2, 3 -> Print
        count = 5 -> Exit
  */ 
