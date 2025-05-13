
class AccountTransfer implements Runnable {
    private Account source;
    private Account destination;
    private int amount;

    public AccountTransfer(Account source, Account destination, int amount) {
        this.source = source;
        this.destination = destination;
        this.amount = amount;
    }

    @Override
    public void run() {
        // using hashcodes to determine which account is first and which is second
        Account firstLock = (source.hashCode() < destination.hashCode()) ? source : destination;
        Account secondLock = (source.hashCode() < destination.hashCode()) ? destination : source;

        synchronized (firstLock) {
            System.out.println(Thread.currentThread().getName() + " locked " + firstLock.getName());

            try {
                Thread.sleep(100); // Simulate processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (secondLock) {
                System.out.println(Thread.currentThread().getName() + " locked " + secondLock.getName());

                source.withdraw(amount);
                destination.deposit(amount);
            }
        }
    }
}


