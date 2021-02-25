package threadprogram;

public class WorkerClass implements Runnable {
    @Override
    public void run() {
 System.out.println("Pool thread");
    }
}
