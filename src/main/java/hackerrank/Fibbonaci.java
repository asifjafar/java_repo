package hackerrank;

import java.util.Scanner;

/**
 * Created by User on 13-04-2019.
 */
public class Fibbonaci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        System.out.println(a);
        int b = 1;
        System.out.println(b);
        for(int i = 0; i<n; i++){
            int c = a + b;
            System.out.print(c);
            a = b;
            b = c;
        }
    }
}
