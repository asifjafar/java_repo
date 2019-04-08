package com.java.Oracle;

/**
 * Created by prasun.pallav on 2/28/2019.
 */
public class StringPermutation {
    public static void main(String args[]) {
        String str = "ABC";
        int n = str.length();
        permute(str, 0, n - 1);
    }

    static void permute(String str, int f, int l) {
        if (f == l)
            System.out.println(str);
        else {
            for (int i = f; i <= l; i++) {
                str = swap(str, f, i);
                permute(str, f + 1, l);
                str = swap(str, f, i);
            }
        }
    }
    public static String swap(String str, int i, int j){
        char temp;
        char[] c = str.toCharArray();
        temp = c[i];
        c[i] = c[j];
        c[j] = temp;
        return String.valueOf(c);
    }
}
