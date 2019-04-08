package com.java.Oracle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by prasun.pallav on 12/20/2018.
 */
public class LargestSumSubarray {
    public static void main(String args[]) {
        int[] arr = {3, 3, 9, 9, -5};
        Arrays.sort(arr);
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
        int sum = 0;
        int m = 644847772;
        ArrayList al = new ArrayList();
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i; j <= arr.length - 1; j++) {
                sum = sum + arr[j];
//                int mod = sum % m;
                al.add(sum);
                if (j == arr.length - 1) {
                    sum = 0;
                    break;
                }
            }
        }
        System.out.println(al);
        Object obj = Collections.max(al);
        Integer l = (Integer) obj;
//        System.out.println("Subarray sum of % 7 is : " + l);
        System.out.println(obj);
    }
}
