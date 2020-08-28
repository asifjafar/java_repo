/**
 * Created by prasun.pallav on 1/30/2019.
 */
public class Star {
    public static void main(String args[]) {
        String s = "#";
        int n = 6;
        int i;
        for (i = 0; i < n; i++) {
            for (int j = i; j <= n-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
