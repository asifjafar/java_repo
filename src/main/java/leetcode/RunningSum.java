package leetcode;

/**
 * Created by User on 29-08-2020.
 */

/**
 * Input: nums = [1,2,3,4]
 Output: [1,3,6,10]
 Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */

public class RunningSum {
    public static void main(String[] args) {
        int[] sum = runningSum(new int[]{1,1,1,1,1});
        for (int a : sum) {
            System.out.println(a);
        }
    }

    private static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int counter = 0;
        boolean empty = true;
        int lastElement = 0;
        for (int a : nums) {
            if (!empty) {
                lastElement = runningSum[counter - 1];
            }
            runningSum[counter] = lastElement + a;
            empty = false;
            counter++;
        }
        return runningSum;
    }
}
