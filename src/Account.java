class Account {
    private String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public synchronized void withdraw(int amount) {
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew " + amount + " from " + name);
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + " to " + name);
    }
}
