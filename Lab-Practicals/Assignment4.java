// Write a program that calculate percentage marks of the student if marks of 6 subjects are given

import java.util.Scanner;

class Assignment4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        System.out.print("Enter maximum marks in each subject: ");
        int m = sc.nextInt();
        float perc = 0.0f;
        for(int i=0; i<n; i++) {
            System.out.print("Enter marks of subject no. " + (i+1) + ": ");
            perc += 100 * sc.nextInt() / (m*n);
        } 
        System.out.println("Total percentage: " + perc + "%");
        sc.close();
    }
}
