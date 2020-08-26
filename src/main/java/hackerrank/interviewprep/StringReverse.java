package hackerrank.interviewprep;

/**
 * Created by User on 13-04-2019.
 */
public class StringReverse {
    public static void main(String[] args) {
        String str = "My Name Is Asif";
        int len = str.length();
        char[] arr = str.toCharArray();
       for(int i = len-1; i >= 0; i--){
           System.out.println(arr[i]);
       }
    }
}
