public class Main extends Thread{
    public void run() {
        System.out.println("Inside the run method.");
    }

    public static void main(String[] args) {
        Main t1 = new Main();
        Main t2 = new Main();
        Main t3 = new Main();

        System.out.println("t1 thread priority: " + t1.getPriority());
        System.out.println("t2 thread priority: " + t2.getPriority());
        System.out.println("t3 thread priority: " + t3.getPriority());

        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        System.out.println("t1 thread priority: " + t1.getPriority());
        System.out.println("t2 thread priority: " + t2.getPriority());
        System.out.println("t3 thread priority: " + t3.getPriority());

        Thread.currentThread().setPriority(MAX_PRIORITY);
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
    }
}
