package Oracle;

/**
 * Created by prasun.pallav on 2/11/2019.
 */
public class Pangram {
     String pangrams(String s) {
        int index = 0;
        boolean[] mark = new boolean[26];
        int flag = 1;
        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) &&
                    s.charAt(i) <= 'Z')
                index = s.charAt(i) - 'A';
            else if ('a' <= s.charAt(i) &&
                    s.charAt(i) <= 'z')

                index = s.charAt(i) - 'a';
            mark[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (!mark[i])
                flag = 0;
        }
        if (flag == 1)
            return "pangram";
        else
            return "not pangram";
    }

    public static void main(String args[]) {
        String s = "We promptly judged antique ivory buckles for the next prize";
        Pangram p = new Pangram();
        String result = p.pangrams(s);
        System.out.println(result);
    }
}
