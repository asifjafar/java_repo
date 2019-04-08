package com.java.Oracle;

/**
 * Created by prasun.pallav on 2/19/2019.
 */
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class CardWar {
    public int solution(String A, String B) {
        // write your code in Java SE 8
        int count = 0;
        char a[] = A.toCharArray();
        char b[] = B.toCharArray();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (i == j) {
                    if (getRank(a[i]) > getRank(b[j])) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public int getRank(char c) {
        if (c == 'A')
            return 14;
        else if (c == 'K')
            return 13;
        else if (c == 'Q')
            return 12;
        else if (c == 'J')
            return 11;
        else if (c == 'T')
            return 10;
        else if (c == '9')
            return 9;
        else if (c == '8')
            return 8;
        else if (c == '7')
            return 7;
        else if (c == '6')
            return 6;
        else if (c == '5')
            return 5;
        else if (c == '4')
            return 4;
        else if (c == '3')
            return 3;
        else if (c == '2')
            return 2;
        else return 0;
    }

    public static void main(String args[]) {
        CardWar cw = new CardWar();
        int result = cw.solution("23A84Q","KTQ25J");
        System.out.println(result);
    }
}
