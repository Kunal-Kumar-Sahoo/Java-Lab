/*
Write an interactive program to print a diamond shape. For example, if user enters the number 3, the diamond will be as follows:
  *
 * *   
* * *
 * *
  *

*/

import java.io.*;

class Assignment10 {
    public static void main(String[] args) throws Exception {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);
      
        drawDiamond(Integer.parseInt(buffer.readLine()));
    }

    private static void drawDiamond(int rows) {
        // upper half
        for(int i=0; i<rows; i++) {
            // spaces
            for(int j=i; j<rows; j++)
                System.out.print(" ");
            // characters
            for(int j=0; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        // lower half
        for(int i=0; i<rows-1; i++) {
            // spaces
            for(int j=0; j<=i+1; j++)
                System.out.print(" ");
            // characters
            for(int j=rows-1; j>i; j--)
                System.out.print("* ");
            System.out.println();
        }
    }
}
