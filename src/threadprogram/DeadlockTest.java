package threadprogram;

public class DeadlockTest {
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new First());
        t1.start();
        Thread t2 = new Thread(new Second());
        t2.start();
    }

}

class First implements Runnable
{
    public void run()
    {
        synchronized (First.class) {
            System.out.println("In first class first");
            try {
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
                   synchronized (Second.class){
                System.out.println("In second first");
                   }
        }
    }

class Second implements Runnable{
    public void run()
    {
        synchronized (Second.class)
        {
            System.out.println("In second class first");
            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            synchronized (First.class){
                System.out.println("In second first");
              //  notify();
            }


        }
    }
}