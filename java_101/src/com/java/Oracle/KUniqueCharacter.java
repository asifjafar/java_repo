package com.java.Oracle;

/**
 * Created by prasun.pallav on 3/26/2019.
 */
import java.util.*;
import java.io.*;

public class KUniqueCharacter {
    static boolean isValid(int count[],int k){
        int val=0;
        for(int i=0; i<26;i++){
            if(count[i]>0){
                val++;
            }
        }
        return (k>=val);
    }
    public static String KUniqueCharacters(String str) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
        int k = Integer.parseInt("" + str.charAt(0));
        str = str.substring(1, str.length());
        int n = str.length();
        int start=0;
        int end=0;
        int maxWindowSize = 1;
        int maxWindowStart = 0;
        int count[] = new int[26];
        Arrays.fill(count, 0);
        count[str.charAt(0)-'a']++;
        for(int i=1; i < n; i++){
            count[str.charAt(i)-'a']++;
            end++;
            while(!isValid(count, k)){
                count[str.charAt(start)-'a']--;
                start++;
            }
            if(end - start + 1 > maxWindowSize){
                maxWindowSize = end - start + 1;
                maxWindowStart = start;
            }
        }
        return str.substring(maxWindowStart, maxWindowStart+maxWindowSize);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(KUniqueCharacters(s.nextLine()));
    }

}
