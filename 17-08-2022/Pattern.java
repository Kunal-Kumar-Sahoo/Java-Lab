/*
        *
       ***
      *****
     *******
    *********
 */ 

import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        drawPattern(sc.nextInt());
        sc.close();
    }

    private static void drawPattern(int rows) {
        for(int i=0; i<rows; i++) {
            for(int j=0; j<rows-i-1; j++)
                System.out.print(" ");
            for(int j=0; j<2*i+1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
