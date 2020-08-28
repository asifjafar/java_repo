package Oracle;

/**
 * Created by prasun.pallav on 2/13/2019.
 */
public class UniqueNumber {
    public static void main(String args[]) {
        int arr[] = {10, 10, 10, 10, 20, 20, 30, 30, 40, 50, 50, 50};
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        for (int aTemp : temp) {
            if (aTemp != 0)
                System.out.print(aTemp + " ");
        }
    }
}
