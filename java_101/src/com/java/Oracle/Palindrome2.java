package com.java.Oracle;

/**
 * Created by prasun.pallav on 3/26/2019.
 */
import java.util.*;
import java.io.*;

public class Palindrome2 {
    public static String PalindromeTwo(String str) {
        int len = str.length();
        int j = len-1;
        int i = 0;
        while(i <= j) {
            int ch1 = str.charAt(i);
            int ch2 = str.charAt(j);
            if(!((ch1 >= 65 && ch1 <=90) || (ch1 >= 97 && ch1 <= 122)) && !((ch2 >= 65 && ch2 <=90) || (ch2 >= 97 && ch2 <= 122))){

                i++;
                j--;
                continue;
            }
            if(!((ch1 >= 65 && ch1 <=90) || (ch1 >= 97 && ch1 <= 122))){
                i++;
                continue;
            }
            if(!((ch2 >= 65 && ch2 <=90) || (ch2 >= 97 && ch2 <= 122))){
                j--;
                continue;
            }
            if(ch1 >= ch2){
                if(ch1 != ch2 && ch1 != ch2+32){
                    return "false";
                }
            }
            else{
                if(ch1 != ch2 && ch1+32 != ch2){
                    return "false";
                }
            }
            i++;
            j--;
        }
        return "true";

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(PalindromeTwo(s.nextLine()));
    }

}
