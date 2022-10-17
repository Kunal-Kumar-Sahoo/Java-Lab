// Find occurence of a word in a file.

import java.io.*;
import java.util.*;

public class Program3 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(
						new FileReader("input1.txt")
					);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a word to search: ");
			String s1 = sc.next();
			String[] arr;
			int l = 1, c = 1;
			for(String s = br.readLine(); s != null; s = br.readLine(), l++, c = 1) {
				arr = s.split(" ");
				for(String word: arr) {
					if(s1.equals(word))
						System.out.println("Line: " + l + " Column: " + c);
					c += word.length() + 1;
				}
			}
		} catch(Exception e) { System.out.println("File error: " + e); }
	}
}