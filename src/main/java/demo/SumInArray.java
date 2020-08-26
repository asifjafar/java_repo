package demo;

/**
 * Created by User on 11-04-2019.
 */
public class SumInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int key = 7;

        System.out.println("Present " + isPresent(arr, key));
    }

    private static boolean isPresent(int arr[], int key) {
        //1,2,3,4,5,6
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            for (int j = i; j < arr.length - 1; j++) {
                int b = arr[j];
                for (int k = j; k < arr.length - 2; k++) {
                    int c = arr[k];
                    if (a + b + c == key) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
