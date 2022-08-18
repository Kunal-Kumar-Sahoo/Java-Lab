// Write  a program to accept a line  and check  how many consonants  and vowels are there  in line.

import java.util.Scanner;

class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of string: ");
        String str = sc.nextLine();
        int countVowels = 0;
        int countConsonants = 0;
        for(int i=0; i < str.length(); i++) 
            if(Character.isLetter(str.charAt(i)))
                switch(Character.toLowerCase(str.charAt(i))) {
                    case 'a', 'e', 'i', 'o', 'u' -> countVowels++;
                    default -> countConsonants++;
                }
        System.out.println("Number of vowels: " + countVowels);
        System.out.println("Number of consonants: " + countConsonants);
        sc.close();
    }
}
