class Greet {
    // Input using Command-line argument
    public static void main(String[] args) {
        // the main method on execution with the java bin file can accept command-line arguments in form of an array of String.
        for(String name: args) 
            System.out.println("Hello, " + name);
    }
}
