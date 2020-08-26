package Oracle;

/**
 * Created by prasun.pallav on 2/28/2019.
 */
public class SmallestPositiveNumber {
    static int segregate(int arr[], int size) {
        int j = 0, i;
        for (i = 0; i < size; i++) {
            if (arr[i] <= 0) {
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        return j;
    }

    static int findMissingPositive(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++) {
            int x = Math.abs(arr[i]);
            if (x - 1 < size && arr[x - 1] > 0)
                arr[x - 1] = -arr[x - 1];
        }
        // Return the first index value at which
        // is positive
        for (i = 0; i < size; i++)
            if (arr[i] > 0)
                return i + 1;  // 1 is added becuase indexes
        // start from 0
        return size + 1;
    }

    static int findMissing(int arr[], int size) {
        int shift = segregate(arr, size);
        int arr2[] = new int[size - shift];
        int j = 0;
        for (int i = shift; i < size; i++) {
            arr2[j] = arr[i];
            j++;
        }
        return findMissingPositive(arr2, j);
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 10, 2, -10, -20};
        int arr_size = arr.length;
        int missing = findMissing(arr, arr_size);
        System.out.println("The smallest positive missing number is " +
                missing);
    }
}
