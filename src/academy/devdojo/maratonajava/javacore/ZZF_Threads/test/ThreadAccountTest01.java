package academy.devdojo.maratonajava.javacore.ZZF_Threads.test;

import academy.devdojo.maratonajava.javacore.ZZF_Threads.domain.Account;

public class ThreadAccountTest01 implements Runnable {
    private Account account = new Account();

    static void main() {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "goku");
        Thread t2 = new Thread(threadAccountTest01, "vegeta");
        t1.start();
        t2.start();

    }

    private void withdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(getThreadName() + " is going to withdrawal money");
            account.withdrawal(amount);
            System.out.println(getThreadName() + " finish withdrawing.\nCurrent balance: " + account.getBalance());
        } else {
            System.out.println("Not enough balance for " + getThreadName() + " withdrawal money.");
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("Something very wrong happened");
            }
        }
    }
}
