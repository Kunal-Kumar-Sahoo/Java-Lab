import java.io.*;

class Program1 {
	public static void main(String[] args) {
		FileReader fr = null; // node stream
		BufferedReader br = null;

		try {
			fr = new FileReader("input1.txt");
			br = new BufferedReader(fr);
			for(String s = br.readLine(); s != null; s = br.readLine())
				System.out.println(s);
			br.close();
			fr.close();
		} catch(IOException e) {System.out.println("File error: " + e);}
	}
}