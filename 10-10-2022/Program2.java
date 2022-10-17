import java.io.*;

class Program2 {
	public static void main(String[] args) {
		String[] contents = {"My name is Kunal", "I am learning Java", "Java is fun"};
		try {
			PrintWriter pr = new PrintWriter(new BufferedWriter(new FileWriter("input.txt")));
			
			for(String content: contents)
				pr.println(content);
			
			pr.flush();
			pr.close();

		} catch(Exception e) { System.out.println("File error: " + e); }
	}
}