/*
Write an interactive program to print a string entered in a pyramid form. For instance, the string “stream” has to be displayed as follows:
     S
    S t
   S t r
  S t r e
 S t r e a
S t r e a m
*/

import java.util.Scanner;

class Assignment9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        drawPyramid(s);
        sc.close();
    }

    static void drawPyramid(String s) {
        for(int i=0; i<s.length(); i++) {
            // spaces
            for(int j=i; j<s.length()-1; j++)
                System.out.print(" ");
            // Characters
            for(int j=0; j<=i; j++)
                System.out.print(s.charAt(j) + " ");
            // newline
            System.out.println();
        }
    }
}
