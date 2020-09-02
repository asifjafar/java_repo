package dailypro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Input: A = [1,3,3,5,7,8,9,9,9,15], target = 9
 * Output: [6,8]
 * <p>
 * Input: A = [100, 150, 150, 153], target = 150
 * Output: [1,2]
 * <p>
 * Input: A = [1,2,3,4,5,6,10], target = 9
 * Output: [-1, -1]
 */
public class RepeatingElementIndex {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(getIndexes(arr, 1));
    }

    private static String getIndexes(int[] arr, int target) {
        int[] result = {-1, -1};
        Set<Integer> set = new HashSet<>();
        boolean lastIndexRecorded = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (set.add(arr[i])) {
                    result[0] = i;
                }
            } else if (!set.isEmpty()) {
                lastIndexRecorded = true;
                result[1] = i - 1;
                break;
            }
        }

        if (!lastIndexRecorded && !set.isEmpty()) {
            result[1] = arr.length - 1;
        }

        return Arrays.toString(result);
    }
}
