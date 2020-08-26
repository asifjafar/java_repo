package Oracle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class StringPermutation {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
    /*    while ((line = in.readLine()) != null) {
            System.out.println(line);
        }*/
        line = in.readLine();
        String[] str = line!=null ?  line.split(",") : new String[10];
        if(str[0]!=null && str[1]!=null){
            System.out.println(getSuffix(str[0], str[1]));
        }


    }
    private static String getSuffix(String str1, String str2){
        StringBuilder builder1 = new StringBuilder(str1);
        StringBuilder builder2 = new StringBuilder(str2);
        str1 = builder1.reverse().toString();
        str2 = builder2.reverse().toString();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        StringBuilder builder = new StringBuilder();
        boolean hasCommon = true;
        int counter = 0;
        //for(char c1 : arr1){

        for(char c2: arr2){
            if(arr1[counter]==c2){
                builder.append(c2);
                counter++;
            }else{
                hasCommon = false;
            }
            //  if(!hasCommon) break;
            // }
            // if(!hasCommon) break;
        }
        return builder.reverse().toString();


    }
}