package Oracle;

/**
 * Created by prasun.pallav on 12/19/2018.
 */
public class Palindrome {
    public static void main(String args[]) {
        String s = "MALAYALAM";
        String s2 = "";
        char c[] = s.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            s2 = s2 + c[i];
        }
        if (s2.equals(s))
            System.out.println("Palindrome is... "+s2);
        else
            System.out.println("Not Palindrome");
    }
}
