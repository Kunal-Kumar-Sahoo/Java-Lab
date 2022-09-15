class Main {
    public int x, y;
    
    public Main() {
        this(10, 20); // If calling constructor inside a method in class using this(), then this statement should be the first line.
        x = 5; y = 7;
        this.disp();
    }

    public Main(int a, int b) {
        System.out.println("Parameterized constructor");
        x = a;
        y = b;
        this.disp();
    }

    public void disp() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static void main(String[] args) {
        Main o1 = new Main();
        o1.disp();
    }
}
