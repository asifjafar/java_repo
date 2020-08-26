package demo;

import java.util.*;

/**
 * Created by User on 28-04-2019.
 */
public class KthElement {
    public static void main(String[] args) {
        //int[] arr = {3,5,3,1,5,7,4};
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        System.out.println("Size: " +sizeOfArray);
        int index = scanner.nextInt();
        System.out.println("index: " +index);
        int[] arr = new int[sizeOfArray];
        for(int i = 0; i<sizeOfArray; i++){
            arr[i] = scanner.nextInt();
        }

        /*for(int i = 0; i<sizeOfArray; i++){
            System.out.println(arr[i]);
        }*/

        List<Integer> integers = new ArrayList<>();

        for(int i : arr){
            if(!integers.contains(i))
                integers.add(i);
        }
        Collections.sort(integers);

        System.out.println(integers.get(index-1));
    }
}
