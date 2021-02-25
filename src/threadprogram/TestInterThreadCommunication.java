package threadprogram;

public class TestInterThreadCommunication {
    public static void main(String[] args)
    {
        final InterThreadCommunicationClass obj = new InterThreadCommunicationClass();
        new Thread() {
            @Override
            public void run() {
                obj.withdraw(15000);
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                obj.deposit(10000);
            }
        }.start();
    }
}

