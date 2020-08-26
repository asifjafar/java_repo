package hackerrank.sortingalgorithm;

/**
 * Created by User on 12-04-2019.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {1,5,3,4,2,6};
        int len = arr.length;
        for(int i = 0; i<len-1;i++){
            int minIndex = i;
            for(int j = i+1; j<len; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("Sorted list is:");
        for(int i =0; i<len; i++){
            System.out.print(arr[i]);
        }
    }
}
