package Oracle;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by prasun.pallav on 2/19/2019.
 */
public class Soldier {
    private static int count(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;
        int totalCount = 0;
        for (int i = 0; i <= n - 1; i++) {
            if (i < n - 1 && arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (i < n - 1 && arr[i + 1] - arr[i] == 1) {
                    totalCount += count + 1;
                    count = 0;
                } else {
                    count = 0;
                }
            }
        }

        return totalCount;
    }

    public static void main(String args[]) throws IOException {

        int[] arr = {3, 4, 3, 0, 2, 2, 3, 0, 0};
        int result = count(arr);
        System.out.print(result);
    }
}
