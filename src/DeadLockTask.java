class DeadLockTask implements Runnable {
    private Resource resource1;
    private Resource resource2;

    public DeadLockTask(Resource resource1, Resource resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        synchronized (resource1) {
            System.out.println(Thread.currentThread().getName() + " locked " + resource1.getName());

            try {
                // Simulate some work
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " trying to lock " + resource2.getName());

            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + " locked " + resource2.getName());
            }
        }
    }
}