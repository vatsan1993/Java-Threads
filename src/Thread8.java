public class Thread8 {


    public static void main(String[] args) {
        Account accountA = new Account("Account A", 1000);
        Account accountB = new Account("Account B", 2000);

        Thread t1 = new Thread(new AccountTransfer(accountA, accountB, 300), "Transfer1");
        Thread t2 = new Thread(new AccountTransfer(accountB, accountA, 150), "Transfer2");

        t1.start();
        t2.start();
    }

}
