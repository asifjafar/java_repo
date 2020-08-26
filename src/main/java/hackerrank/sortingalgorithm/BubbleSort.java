package hackerrank.sortingalgorithm;

import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 12-04-2019.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {1,5,3,4,2,6};
        int len = arr.length;
        for(int k = 1; k<len-1; k++){
            for(int i = 0; i<len-2; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println("Sorted list is:");
        for(int i =0; i<len; i++){
            System.out.print(arr[i]);
        }
    }
}
