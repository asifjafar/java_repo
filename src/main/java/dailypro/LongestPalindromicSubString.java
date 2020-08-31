package dailypro;

/**
 * Input: "banana"
 Output: "anana"
 Input: "million"
 Output: "illi"
 */
public class LongestPalindromicSubString {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("banana"));
    }

    private static String longestPalindrome(String str){

       int start = 0;
       int end = 0;

       for( int i =0; i <= str.length(); i++){
           int len1 = expandRangeFromMiddle(str, i, i);
           int len2 = expandRangeFromMiddle(str, i, i+1);
           int len = Math.max(len1, len2);
           if(len > end - start) {
               start = i - ((len -1)/ 2);
               end = i + (len / 2);
           }
       }

        return str.substring(start, end + 1);
    }

    private static int expandRangeFromMiddle(String str, int left, int right) {
        if (str == null || left > right) return 0;

        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

}
