import java.util.*;

class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String[] line = sc.nextLine().split(" ");
        int count = 0;
        for(String word: line) {
            try{
                if(Character.isUpperCase(word.trim().charAt(0)))
                    count++;
            } catch(Exception e) {continue;}
        }
        System.out.println("Number of words that start with capital letter: " + count);
        sc.close();
    }
}
