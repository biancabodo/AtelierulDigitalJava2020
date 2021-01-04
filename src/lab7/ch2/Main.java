package lab7.ch2;

public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("ba1", 2000);
        BankAccount ba2 = new BankAccount("ba2", 4000);
        BankAccount ba3 = new BankAccount("ba3", 2500);

        TransactionThread t1 = new TransactionThread("T1", ba1, ba2, 2000);
        TransactionThread t2 = new TransactionThread("T2", ba1, ba3, 1900);

        t1.start();
        t2.start();
    }


}
