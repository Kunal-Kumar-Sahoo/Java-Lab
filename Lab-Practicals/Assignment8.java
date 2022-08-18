// Create a class which ask the user to enter a sentence, and it should display count of each vowel type in the sentence. The program should continue till user enters a word “quit”. Display the total count of each vowel for all sentences.

import java.io.*;

class CountVowels {
    private String str;
    private static String terminator;
    private int count;

    private InputStreamReader input;
    private BufferedReader buffer;

    public CountVowels(String terminator) {
        this.input = new InputStreamReader(System.in);
        this.buffer = new BufferedReader(input);
        this.str = "";
        this.terminator = terminator;
        this.count = 0;
    }

    public boolean checkTermination() {
        return this.str.equals(this.terminator);
    }

    public void getInput() throws Exception {
        System.out.println("Enter a line: ");
        this.str = this.buffer.readLine();
    }

    public void countVowels() {

        for(int i=0; i<this.str.length(); i++)
            if(Character.isLetter(this.str.charAt(i)))
                switch(Character.toLowerCase(this.str.charAt(i))) {
                    case 'a', 'e', 'i', 'o', 'u' -> this.count++;
                }
    }

    public int getCount() {
        return this.count;
    }

    public void reset() {
        this.count = 0;
    }
}

class Assignment8 {
    public static void main(String[] args) {
        CountVowels count_vowels = new CountVowels("quit");
        while(true) {
            try {
                count_vowels.reset();
                count_vowels.getInput();
                if(count_vowels.checkTermination())
                    break;
                count_vowels.countVowels();
                System.out.println("Number of vowels: " + count_vowels.getCount());
                
            } catch(Exception e) {System.out.println(e);}
        } 
    }
}
