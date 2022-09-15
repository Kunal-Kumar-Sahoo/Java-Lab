import java.util.*;

class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = null;
        int countVowels = 0;
        int countConsonants = 0;
        char c;
        while(true) {
            countVowels = countConsonants = 0;
            System.out.println("Enter a line or type 'quit' to exit:");
            s = sc.nextLine();
            if(s.equals("quit")) 
                break;
            for(int i=0; i<s.length(); i++) {
                c = s.charAt(i);
                if(Character.isLetter(c))
                    switch(Character.toLowerCase(c)) {
                        case 'a', 'e', 'i', 'o', 'u' -> countVowels++;
                        default -> countConsonants++;
                    }
            }
            System.out.println("Number of vowels: " + countVowels);
            System.out.println("Number of consonants: " + countConsonants);
        }
        sc.close();
    }
}
