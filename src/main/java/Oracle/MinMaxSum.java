package Oracle;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import javax.swing.*;

/** Created by prasun.pallav on 1/5/2019. */
public class MinMaxSum {
  public static void main(String args[]) {
    int arr[] = {2, 3, 4, 3, 3};
    //        Arrays.sort(arr);
    //        long sum = 0;
    //        for (int i=0; i<=arr.length-1;i++) {
    //            sum = sum + arr[i];
    //        }
    //        long result[] = new long[arr.length];
    //        for (int i=0; i<=arr.length-1;i++) {
    //            result[i] = sum - arr[i];
    //        }
    //        System.out.println(result[0]);
    //        System.out.println(result[result.length-1]);

    PriorityQueue<Integer> queue = new PriorityQueue<>();
    for (int a : arr) {
      queue.add(a);
    }
    List<Integer> nums = new ArrayList<Integer>();
    //        int[] arra =
    System.out.println(queue.poll());
  }
}
