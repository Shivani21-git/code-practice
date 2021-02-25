package threadprogram;

public class DeadlockClass {
    public static void main(String[] args) {
        final String resource1 = "Shivani";
        final String resource2 = "Suman";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Holding resource1");
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                    // }  just this will also avoid deadlock
                    synchronized (resource2) {
                        System.out.println("Holding resource2");

                    }
                }
            }


            };
        Thread t2 = new Thread() {
            public void run() {
                //synchronized (resource1) { This code will avoid deadlock
                synchronized (resource2) {
                    System.out.println("Holding resource2");
                    try {
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                //} just this will also avoid deadlock
                    //synchronized (resource2) { This code will avoid deadlock
                    synchronized (resource1) {
                        System.out.println("Holding resource1");

                    }
                }

            }
        };
        t1.start();
        t2.start();
    }
}










