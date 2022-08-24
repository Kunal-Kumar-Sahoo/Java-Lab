import java.io.*;

class Assignment2 {
    public static void main(String[] args) {
        try {
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(input);
            System.out.print("Enter how many prime terms would you like to print? ");
            int n = Integer.parseInt(buffer.readLine());
            boolean isPrime;
            for(int i=2; n>0; i++) {
                isPrime = true;
                for(int j=2; j<=Math.sqrt(i); j++)
                    if(i%j == 0) {
                        isPrime = false;
                        break;
                    }
                if(isPrime) {
                    System.out.print(i + " ");
                    n--;
                }
            }
            System.out.println();

        } catch(Exception e) {System.out.println(e);}
    }
}
