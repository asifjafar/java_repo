package Oracle;

/**
 * Created by prasun.pallav on 3/26/2019.
 */
import java.util.*;

public class FirstNonRepeatingCharacter {
    public static String NonrepeatingCharacter(String str) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
        str = str.trim();
        Map<String, Integer> meta = new LinkedHashMap<>();
        for(int i = 0; i < str.length(); i++){
            String s = String.valueOf(str.charAt(i));
            if(meta.containsKey(s)){
                meta.put(s, meta.get(s)+1);
                continue;
            }
            meta.put(s,1);
        }
        for(Map.Entry<String, Integer> e : meta.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        }

        return str;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(NonrepeatingCharacter(s.nextLine()));
    }

}
