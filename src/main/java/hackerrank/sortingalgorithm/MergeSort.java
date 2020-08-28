package hackerrank.sortingalgorithm;

/**
 * Created by User on 12-04-2019.
 */
public class MergeSort {

    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private void sort(int[] arr, int left, int right){
        if(left<right){
            int mid = (left+right)/2;
            sort(arr, left, mid);
            sort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right){

        int lenLeft = mid-left + 1;
        int lenRight = right - mid;
        // create left and right arrays
        int[] leftArr = new int[lenLeft];
        int[] rightArr = new int[lenRight];

        for(int i = 0; i<lenLeft;++i){
            leftArr[i] = arr[left+i];
        }

        for(int i = 0; i<lenRight;++i){
            rightArr[i] = arr[mid+1+i];
        }
        int i = 0, j = 0, k = left;

        while(i < lenLeft && j <lenRight){
            if(leftArr[i]<=rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i<lenLeft){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while(j<lenRight){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
