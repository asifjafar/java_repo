import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by prasun.pallav on 1/31/2019.
 */
public class MissingTerm {

    private static TreeSet missingNumbers(int[] arr, int[] brr) {
//        203 204 205 206 207 208 203 204 205 206
//        203 204 204 205 206 207 205 208 203 206 205 206 204
        //0 0 0 2 2 3 3 3 4
        // String s ="C:";
        //System.out.print(s);
        int n = arr.length;
        int m = brr.length;
        Arrays.sort(arr);
        Arrays.sort(brr);
        ArrayList a1 = new ArrayList();
        for (int i = 0; i < n; i++) {
            a1.add(arr[i]);
        }
        TreeSet s1 = new TreeSet();
        int count = 0;
        int count1 = 0;
        int diff = 0;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            count = 0;
            count1 = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    ++count;
            }
            for (int j = 0; j < m; j++) {
                if (brr[j] == key) {
                    ++count1;
                }
                if (!a1.contains(brr[j])) {
                    s1.add(brr[j]);
                }
            }
            diff = count1 - count;
            if (diff != 0)
                s1.add(arr[i]);
        }
        return s1;
    }

    public static void main(String args[]) throws IOException {

        int[] arr = {11, 4, 11, 7, 13, 4, 12, 11, 10, 14};

        int[] brr = {11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12};
        TreeSet result = missingNumbers(arr, brr);
        for (Object o : result) {
            System.out.print(o + " ");
        }
    }
}
