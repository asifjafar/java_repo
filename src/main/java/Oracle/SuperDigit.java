package Oracle;

/**
 * Created by prasun.pallav on 1/18/2019.
 */
public class SuperDigit {
    public static void main(String args[]) {
        SuperDigit a1 = new SuperDigit();
        String s = "9875";
        String s1 = "";
        int k = 4;
        for (int i = 0; i < k; i++) {
            s1 = s1 + s;
        }
        long a = Long.parseLong(s1);
        System.out.println("Super Digit is : " + a1.findSuperDigit(a));
        System.out.println(s1);
    }

    private long findSuperDigit(long x) {
        if (x < 1)
            return 0;
        else {
            long m = x % 10;
            long s = m + findSuperDigit(x / 10);
            if (s < 10)
                return s;
            else {
                if (x < 1)
                    return 0;
                else
                    return findSuperDigit(s);
            }
        }
    }

}
