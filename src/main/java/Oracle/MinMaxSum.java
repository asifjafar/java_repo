package Oracle;

import java.util.Arrays;

/**
 * Created by prasun.pallav on 1/5/2019.
 */
public class MinMaxSum {
    public static void main(String args[]) {
        long arr[] = {3 ,4 ,7 ,8 ,9};
        Arrays.sort(arr);
        long sum = 0;
        for (int i=0; i<=arr.length-1;i++) {
            sum = sum + arr[i];
        }
        long result[] = new long[arr.length];
        for (int i=0; i<=arr.length-1;i++) {
            result[i] = sum - arr[i];
        }
        System.out.println(result[0]);
        System.out.println(result[result.length-1]);
    }
}
