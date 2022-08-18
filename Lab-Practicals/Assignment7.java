// Write a program to count the number of words that start with capital letters.

import java.util.*;

class Assignment7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of string: ");
        String[] words = sc.nextLine().split(" ");
        int count = 0;
        for(String word: words) 
            try {
                if(Character.isUpperCase(word.charAt(0)))
                    count++;
            } catch(Exception e) {continue;}
        System.out.println("Number of capitalized words: " + count);
        sc.close();
    }
}
