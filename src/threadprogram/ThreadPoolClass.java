package threadprogram;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolClass implements Runnable{
    //overridden method cannot throw Interupted exception

        @Override
        public void run () {
        for (int i = 0; i <= 6; i++) {
            try {
                Thread.sleep(50);
                System.out.println(Thread.currentThread() );// currentThread() is static method therefore we can use it by class name i.e Thread
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception caught");
            }

            System.out.println(i);
        }
    }


    public static void main(String[] args){

        ExecutorService executor = Executors.newFixedThreadPool(3);
  /*     ThreadPoolClass obj = new ThreadPoolClass();
       ThreadPoolClass obj2 = new ThreadPoolClass();
       ThreadPoolClass obj3 = new ThreadPoolClass();
       ThreadPoolClass obj4 = new ThreadPoolClass();
       ThreadPoolClass obj5 = new ThreadPoolClass();
      executor.execute(obj);
      executor.execute(obj2);
        executor.execute(obj3);
        executor.execute(obj4);
     //   executor.execute(obj5);   */
        executor.execute(() -> System.out.println("Using Java 8"));


      // SleepClass ob = new SleepClass();
    //   Runnable ob = new WorkerClass();
    //  executor.execute(ob); // executor.execute() method will take Runnable obj
    }


}
