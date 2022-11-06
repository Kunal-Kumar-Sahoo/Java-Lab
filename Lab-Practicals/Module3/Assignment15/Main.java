public class Main {
    public static void main(String[] args) {
        Resource res = new Resource();
        Thread p = new Producer("P", res);
        Thread c = new Thread(new Consumer("C", res));
        p.start();
        // try { Thread.sleep(1000); } 
        // catch(Exception e) { System.out.println(e); }
        c.start();
    }    
}

class Resource {
    boolean isProduced = false;
    int data;

    synchronized void put(int x) throws Exception {
        if(isProduced)
            wait();
        this.data = x;
        isProduced = true;
        notifyAll();
    }

    synchronized int get() throws Exception {
        if(!isProduced)
            wait();
        isProduced = false;
        notifyAll();

        return data;
    }
}


class Producer extends Thread {
    String name;
    Resource res;

    public Producer(String name, Resource res) {
        this.name = name;
        this.res = res;
    }

    public void run() {
        try {
            for(int i = 0; i < 10; i++) {
                res.put(i);
                System.out.println("Produced: " + i);
                Thread.sleep(1000);
            }
        } catch(Exception e) {}
        finally { System.out.println("Producer finished the job"); }
    }
}


class Consumer implements Runnable {
    String name;
    Resource res;

    public Consumer(String name, Resource res) {
        this.name = name;
        this.res = res;
    } 

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Consumed: " + res.get());
                Thread.sleep(1000);
            }
        } catch (Exception e) {}
        finally { System.out.println("Consumer finished the job"); }
    }
}