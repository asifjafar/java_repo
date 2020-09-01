package dailypro;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Input: '((()))'
 * Output: True
 * <p>
 * Input: '[()]{}'
 * Output: True
 * <p>
 * Input: '({[)]'
 * Output: False
 */
public class ValidateParantheses {

    private static Map<Character, Integer> content = new HashMap<>();

    static {
        content.put('(', 1);
        content.put(')', -1);
        content.put('{', 2);
        content.put('}', -2);
        content.put('[', 3);
        content.put(']', -3);
    }


    public static void main(String[] args) {

        System.out.println(isValidString("(}{)"));
    }

    private static boolean isValidString(String str) {

        char[] chars = str.toCharArray();

        int[] actual = new int[chars.length];

        int count = 0;
        for (char a : str.toCharArray()) {
            actual[count] = content.get(a);
            count++;
        }

        int len = actual.length;
        Stack<Integer> temp = new Stack<Integer>();
        int i = 0;
        while (i < len) {
            int x = actual[i];
            if (!temp.isEmpty() && (temp.peek() + x) == 0) {
                temp.pop();
            } else {
                if(x < 0) return false;
                temp.push(x);
            }

            i++;
        }

        return temp.isEmpty();
    }

}
