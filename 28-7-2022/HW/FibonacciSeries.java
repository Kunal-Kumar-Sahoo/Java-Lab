// Display Fibonacci series through CLI using loops

class FibonacciSeries {
    public static void main(String[] args) {
        if(args.length == 1) {
            int n = Integer.parseInt(args[0]);
            printFibonacciSeries(n);
        }
        else System.out.println("Please enter how many terms you want to print.");
    }

    static void printFibonacciSeries(int n) {
        int a, b=0, c=1;
        for(int i=0; i<n; i++) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a+b;
        }
        System.out.println();
    }

}
