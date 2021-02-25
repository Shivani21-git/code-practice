package threadprogram;

public class InterThreadCommunicationClass {
    int amount = 10000;

    synchronized void withdraw(int amount) {
        if (this.amount < amount) {
            System.out.println("Less Balance");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
            this.amount -= amount;
            System.out.println("Amount Withdrawn");
        }

    synchronized void deposit(int amount) {
        this.amount += amount;
        System.out.println("Amount deposited");
        notify();
    }
}

