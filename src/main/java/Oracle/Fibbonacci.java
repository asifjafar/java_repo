package Oracle;

/**
 * Created by prasun.pallav on 12/14/2018.
 */
public class Fibbonacci {
    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < 5; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
