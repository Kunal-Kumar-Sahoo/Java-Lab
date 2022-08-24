import java.util.*;

class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line:");
        String s = sc.nextLine();
        char c;
        int vowelCount = 0;
        int consonantCount = 0;
        for(int i=0; i<s.length(); i++) {
            c = s.charAt(i);
            if(Character.isLetter(c))
                    switch(Character.toLowerCase(c)) {
                        case 'a', 'e', 'i', 'o', 'u' -> vowelCount++;
                        default -> consonantCount++;
                    }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        sc.close();
    }
}
