package functional;

/**
 * Created by User on 26-08-2020.
 */
public class RunnableEx {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });

        t1.run();

        Thread t2 = new Thread(() -> System.out.println("Printed inside lambda Runnable"));

        t2.run();
    }
}
