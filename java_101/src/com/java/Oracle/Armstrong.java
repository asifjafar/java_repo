package com.java.Oracle;

/**
 * Created by prasun.pallav on 12/11/2018.
 */
public class Armstrong {
    int order(int x) {
        int count = 0;
        while (x != 0) {
            count++;
            x = x / 10;
        }
        return count;
    }

    int power(int r, int order) {
        if (order == 0)
            return 1;
        if (order % 2 == 0)
            return power(r, order / 2) * power(r, order / 2);
        return r * power(r, order / 2) * power(r, order / 2);
    }

    boolean isArmstrong(int x) {
        int order = order(x);
        int sum = 0;
        int temp = x;
        while (temp != 0) {
            int r = temp % 10;
            System.out.println(r);
            sum = sum + power(r, order);
            temp = temp / 10;
        }
        System.out.println(order);
        return sum == x;
    }

    public static void main(String args[]) {
        Armstrong a1 = new Armstrong();
        System.out.println(a1.isArmstrong(153));
    }
}
