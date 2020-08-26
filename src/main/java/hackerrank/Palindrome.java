package hackerrank;

/**
 * Created by User on 13-04-2019.
 */
public class Palindrome {
    public static void main(String[] args) {
        String str = "civic is civic";

        char[] array = str.toCharArray();
        int len = array.length;
        int index = 0;
        boolean isPalindrome = true;
        for(int i = len-1; i>0; i--){
            if(array[i]!=array[index]){
                isPalindrome = false;
                break;
            }
            index++;
        }
        System.out.println(isPalindrome);
        // C I V I C
    }
}
