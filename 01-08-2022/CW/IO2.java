import java.io.*;

class IO2 {
    public static void main(String[] args) {
        try {
            InputStreamReader input = new InputStreamReader(System.in);  // System.in -> Use keyboard as a resource
            BufferedReader buffer = new BufferedReader(input);  // FilterStream
            System.out.print("Enter first number: ");
            int integer1 = Integer.parseInt(buffer.readLine());
            System.out.print("Enter second number: ");
            int integer2 = Integer.parseInt(buffer.readLine());

            System.out.println("Sum is: " + (integer1+integer2));
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
