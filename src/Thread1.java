//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Thread1 {
    public static void main(String[] args) {
        Thread t= new Thread();
        System.out.println(t.getName());
        System.out.println(Thread.currentThread().getName());

        Thread t2 = new Thread("my thread");
        System.out.println(t2.getName());

    }
}