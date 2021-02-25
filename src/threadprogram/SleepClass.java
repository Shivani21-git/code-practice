package threadprogram;

public class SleepClass extends Thread {
    public void run()
    {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500);
                System.out.println(i);

            }
        }
            catch(InterruptedException e){
                System.out.println(e);
                System.out.println("Going into Catch block");
            }
        }
    public static void main(String[] args)
    {
        SleepClass t1 = new SleepClass();
        SleepClass t2 = new SleepClass();
        t1.start();
        t2.start();

    }
}
