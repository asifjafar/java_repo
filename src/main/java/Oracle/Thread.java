package Oracle;

/**
 * Created by prasun.pallav on 12/19/2018.
 */

class Thread1 extends Thread {
    public synchronized void run() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}

class Thread2 extends Thread {
    public synchronized void run() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }
}

public class Thread extends java.lang.Thread {
    public static void main(String args[]) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
