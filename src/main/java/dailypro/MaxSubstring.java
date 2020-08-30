package dailypro;

import java.util.HashSet;
import java.util.Set;

/**
 * print Solution().lengthOfLongestSubstring('abrkaabcdefghijjxxx')
 # 10
 */
public class MaxSubstring {
    public static void main(String[] args) {
        System.out.println(getMaxSubstring("abcabcbb"));
    }

    private static int getMaxSubstring(String str){
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;

        while( right < str.length()){
            if(set.contains(str.charAt(right))){
               set.remove(str.charAt(left++));
            } else {
                set.add(str.charAt(right++));
                max = Math.max(set.size(), max);
            }
        }
        return max;
    }
}
